package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes2.dex */
interface ruh {
    int a();

    void b(PrintWriter printWriter);

    void c();

    void d(List list);

    void e();

    @ResultIgnorabilityUnspecified
    boolean f() throws InterruptedException;
}
