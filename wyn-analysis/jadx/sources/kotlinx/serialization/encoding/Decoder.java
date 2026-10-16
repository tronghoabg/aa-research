package kotlinx.serialization.encoding;

import Vf.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import za.C4658a;

/* loaded from: classes5.dex */
public interface Decoder {
    boolean A();

    byte E();

    C4658a a();

    a b(SerialDescriptor serialDescriptor);

    int e(SerialDescriptor serialDescriptor);

    int h();

    long k();

    Decoder o(SerialDescriptor serialDescriptor);

    short p();

    float q();

    double s();

    boolean t();

    char u();

    String w();

    Object z(KSerializer kSerializer);
}
