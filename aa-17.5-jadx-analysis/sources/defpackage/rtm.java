package defpackage;

import android.os.Bundle;
import com.google.android.gms.car.senderprotocol.Channel;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface rtm {
    void a(Bundle bundle);

    void b() throws IOException;

    void c(Channel channel);

    void d() throws IOException;

    void e(rsl rslVar);

    void f(rvg rvgVar);

    void g();

    void h();

    void i(int i, ByteBuffer byteBuffer, boolean z, rtb rtbVar);
}
