package com.fasterxml.jackson.core.io;

import b.a.a.l;
import java.math.BigInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class BigIntegerParser {
    public static BigInteger parseWithFastParser(String str) {
        try {
            return l.a(str);
        } catch (NumberFormatException e2) {
            if (str.length() > 1000) {
                str = String.valueOf(str.substring(0, 1000)).concat(" [truncated]");
            }
            throw new NumberFormatException("Value \"" + str + "\" can not be represented as `java.math.BigInteger`, reason: " + e2.getMessage());
        }
    }
}
