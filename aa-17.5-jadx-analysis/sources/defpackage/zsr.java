package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface zsr {
    void a();

    void b();

    void c();

    void d();

    boolean e();

    boolean f();

    int h();

    void i(DataOutputStream dataOutputStream) throws IOException;

    @ResultIgnorabilityUnspecified
    void j(DataInputStream dataInputStream) throws IOException;
}
