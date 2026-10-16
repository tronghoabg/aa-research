package com.google.firebase.crashlytics.a.c;

import com.google.firebase.crashlytics.a.e.cu;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final cu f9112a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9113b;

    /* renamed from: c, reason: collision with root package name */
    private final File f9114c;

    ah(cu cuVar, String str, File file) {
        this.f9112a = cuVar;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f9113b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f9114c = file;
    }

    public static ah a(cu cuVar, String str, File file) {
        return new ah(cuVar, str, file);
    }

    public final cu b() {
        return this.f9112a;
    }

    public final File c() {
        return this.f9114c;
    }

    public final String d() {
        return this.f9113b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ah) {
            ah ahVar = (ah) obj;
            if (this.f9112a.equals(ahVar.f9112a) && this.f9113b.equals(ahVar.f9113b) && this.f9114c.equals(ahVar.f9114c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f9112a.hashCode() ^ 1000003) * 1000003) ^ this.f9113b.hashCode();
        return this.f9114c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        File file = this.f9114c;
        return "CrashlyticsReportWithSessionId{report=" + this.f9112a.toString() + ", sessionId=" + this.f9113b + ", reportFile=" + file.toString() + "}";
    }

    public ah() {
        throw null;
    }
}
