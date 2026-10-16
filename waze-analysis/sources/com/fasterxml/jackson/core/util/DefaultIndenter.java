package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter {
    public static final DefaultIndenter SYSTEM_LINEFEED_INSTANCE;
    public static final String SYS_LF;
    private static final long serialVersionUID = 1;
    private final String eol;
    private final int charsPerLevel = 2;
    private final char[] indents = new char[32];

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        SYS_LF = property;
        SYSTEM_LINEFEED_INSTANCE = new DefaultIndenter("  ", property);
    }

    public DefaultIndenter(String str, String str2) {
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            "  ".getChars(0, 2, this.indents, i2);
            i2 += 2;
        }
        this.eol = str2;
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public boolean isInline() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public void writeIndentation(JsonGenerator jsonGenerator, int i2) {
        jsonGenerator.writeRaw(this.eol);
        if (i2 <= 0) {
            return;
        }
        int length = i2 * this.charsPerLevel;
        while (true) {
            char[] cArr = this.indents;
            int length2 = cArr.length;
            if (length <= length2) {
                jsonGenerator.writeRaw(cArr, 0, length);
                return;
            } else {
                jsonGenerator.writeRaw(cArr, 0, length2);
                length -= this.indents.length;
            }
        }
    }
}
