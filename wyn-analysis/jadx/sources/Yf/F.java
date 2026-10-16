package Yf;

import Wf.A0;
import Wf.D0;
import Wf.u0;
import Wf.x0;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f16830a = ff.m.P0(new SerialDescriptor[]{x0.f15656b, A0.f15525b, u0.f15641b, D0.f15535b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        AbstractC3340k.e(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && f16830a.contains(serialDescriptor);
    }
}
