package com.google.d.f.b;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements com.google.d.f.z {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f7765a = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

    /* renamed from: d, reason: collision with root package name */
    private final StringBuilder f7768d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7769e = false;

    /* renamed from: b, reason: collision with root package name */
    private final String f7766b = "[CONTEXT ";

    /* renamed from: c, reason: collision with root package name */
    private final String f7767c = " ]";

    public e(StringBuilder sb) {
        this.f7768d = sb;
    }

    private static int c(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // com.google.d.f.z
    public final void a(String str, Object obj) {
        boolean z = this.f7769e;
        StringBuilder sb = this.f7768d;
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                sb.append((sb.length() > 1000 || sb.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb.append(this.f7766b);
            this.f7769e = true;
        }
        StringBuilder sb2 = this.f7768d;
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (f7765a.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        String string = obj.toString();
        int i2 = 0;
        while (true) {
            int iC = c(string, i2);
            if (iC == -1) {
                sb2.append((CharSequence) string, i2, string.length());
                sb2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                return;
            }
            sb2.append((CharSequence) string, i2, iC);
            i2 = iC + 1;
            char cCharAt = string.charAt(iC);
            if (cCharAt == '\t') {
                cCharAt = 't';
            } else if (cCharAt == '\n') {
                cCharAt = 'n';
            } else if (cCharAt == '\r') {
                cCharAt = 'r';
            } else if (cCharAt != '\"' && cCharAt != '\\') {
                sb2.append((char) 65533);
            }
            sb2.append("\\");
            sb2.append(cCharAt);
        }
    }

    public final void b() {
        if (this.f7769e) {
            this.f7768d.append(this.f7767c);
        }
    }
}
