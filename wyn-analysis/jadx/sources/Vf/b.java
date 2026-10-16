package Vf;

import Wf.C1248f0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public interface b {
    boolean A(SerialDescriptor serialDescriptor, int i5);

    void D(SerialDescriptor serialDescriptor, int i5, double d3);

    void E(SerialDescriptor serialDescriptor, int i5, long j8);

    void c(SerialDescriptor serialDescriptor);

    void f(SerialDescriptor serialDescriptor, int i5, KSerializer kSerializer, Object obj);

    void h(C1248f0 c1248f0, int i5, short s10);

    void i(SerialDescriptor serialDescriptor, int i5, KSerializer kSerializer, Object obj);

    void j(C1248f0 c1248f0, int i5, byte b5);

    void s(SerialDescriptor serialDescriptor, int i5, float f10);

    void t(int i5, int i10, SerialDescriptor serialDescriptor);

    Encoder v(C1248f0 c1248f0, int i5);

    void x(SerialDescriptor serialDescriptor, int i5, boolean z2);

    void y(SerialDescriptor serialDescriptor, int i5, String str);

    void z(C1248f0 c1248f0, int i5, char c10);
}
