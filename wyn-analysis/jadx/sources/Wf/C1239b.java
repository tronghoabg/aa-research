package Wf;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Wf.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1239b extends L {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1239b(SerialDescriptor serialDescriptor, int i5) {
        super(serialDescriptor);
        this.f15575b = i5;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        switch (this.f15575b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
