package com.waze.google_assistant;

import android.net.UrlQuerySanitizer;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ay extends UrlQuerySanitizer {
    public ay() {
        registerParameters(new String[]{"act", "accident_type", "hazard_type", "traffic_type", "entry", "notts", "road_direction", "location_on_road"}, UrlQuerySanitizer.getAllIllegal());
    }

    private static char a(byte b2) {
        return (char) (b2 & 255);
    }

    private static int b(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        if (c2 < 'a' || c2 > 'f') {
            return -1;
        }
        return c2 - 'W';
    }

    @Override // android.net.UrlQuerySanitizer
    public final String unescape(String str) throws UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("utf-8");
            int length = bytes.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
            int i2 = 0;
            while (i2 < length) {
                char cA = a(bytes[i2]);
                if (cA == '+') {
                    byteArrayOutputStream.write(32);
                } else if (cA != '%') {
                    byteArrayOutputStream.write(cA);
                } else {
                    int i3 = i2 + 2;
                    if (i3 < length) {
                        int iB = b(a(bytes[i2 + 1]));
                        int iB2 = b(a(bytes[i3]));
                        if (iB >= 0 && iB2 >= 0) {
                            byteArrayOutputStream.write((iB * 16) + iB2);
                            i2 = i3;
                        }
                    }
                    cA = '%';
                    byteArrayOutputStream.write(cA);
                }
                i2++;
            }
            return byteArrayOutputStream.toString("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }
}
