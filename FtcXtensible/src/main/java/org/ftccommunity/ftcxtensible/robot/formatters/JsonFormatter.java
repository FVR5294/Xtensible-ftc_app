/*
 * Copyright © 2015 David Sargent
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the “Software”), to deal in the Software without restriction,
 * including without limitation  the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and  to permit persons to whom the Software is furnished to
 * do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.ftccommunity.ftcxtensible.robot.formatters;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * Created by David on 8/30/2015.
 */
public class JsonFormatter extends Formatter {
    /**
     * Converts stopMode {@link LogRecord} object into stopMode string representation. The
     * resulted string is usually localized and includes the message field of
     * the record.
     *
     * @param r the log record to be formatted into stopMode string.
     * @return the formatted string.
     */
    @Override
    public String format(LogRecord r) {
        Gson gson = new GsonBuilder().create();
        JSON json = JSON.fromLogRecord(r, formatMessage(r));
        return gson.toJson(json);
    }

}
