package Wf;

import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Wf.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1248f0 extends L {

    /* renamed from: b, reason: collision with root package name */
    public final String f15598b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248f0(SerialDescriptor primitive) {
        super(primitive);
        AbstractC3340k.e(primitive, "primitive");
        this.f15598b = primitive.h() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.f15598b;
    }
}
