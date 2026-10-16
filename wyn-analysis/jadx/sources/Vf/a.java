package Vf;

import Wf.C1248f0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import za.C4658a;

/* loaded from: classes5.dex */
public interface a {
    Object B(SerialDescriptor serialDescriptor, int i5, KSerializer kSerializer, Object obj);

    double C(SerialDescriptor serialDescriptor, int i5);

    Object D(SerialDescriptor serialDescriptor, int i5, KSerializer kSerializer, Object obj);

    C4658a a();

    void c(SerialDescriptor serialDescriptor);

    long f(SerialDescriptor serialDescriptor, int i5);

    int i(SerialDescriptor serialDescriptor, int i5);

    short j(C1248f0 c1248f0, int i5);

    String l(SerialDescriptor serialDescriptor, int i5);

    int m(SerialDescriptor serialDescriptor);

    byte n(C1248f0 c1248f0, int i5);

    float r(SerialDescriptor serialDescriptor, int i5);

    Decoder v(C1248f0 c1248f0, int i5);

    char x(C1248f0 c1248f0, int i5);

    boolean y(SerialDescriptor serialDescriptor, int i5);
}
