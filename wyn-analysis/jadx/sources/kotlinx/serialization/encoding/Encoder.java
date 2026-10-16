package kotlinx.serialization.encoding;

import Vf.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import za.C4658a;

/* loaded from: classes5.dex */
public interface Encoder {
    void C(int i5);

    void F(String str);

    C4658a a();

    b b(SerialDescriptor serialDescriptor);

    void e(double d3);

    void g(byte b5);

    b k(SerialDescriptor serialDescriptor, int i5);

    void l(SerialDescriptor serialDescriptor, int i5);

    Encoder m(SerialDescriptor serialDescriptor);

    void n(KSerializer kSerializer, Object obj);

    void o(long j8);

    void p();

    void q(short s10);

    void r(boolean z2);

    void u(float f10);

    void w(char c10);
}
