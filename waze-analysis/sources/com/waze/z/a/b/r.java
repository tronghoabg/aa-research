package com.waze.z.a.b;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.waze.z.a.be;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class r implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f45766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f45767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.g.a.p f45768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f45769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f45770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f45771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f45772g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f45773h;

    public /* synthetic */ r(Modifier modifier, ModalBottomSheetState modalBottomSheetState, h.g.a.p pVar, boolean z, h.g.a.p pVar2, int i2, int i3, int i4) {
        this.f45773h = i4;
        this.f45766a = modifier;
        this.f45772g = modalBottomSheetState;
        this.f45771f = pVar;
        this.f45767b = z;
        this.f45768c = pVar2;
        this.f45769d = i2;
        this.f45770e = i3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.foundation.interaction.MutableInteractionSource, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.p, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f45773h != 0) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f45769d | 1);
            int i2 = this.f45770e;
            h.g.a.p pVar = this.f45768c;
            boolean z = this.f45767b;
            ?? r3 = this.f45771f;
            be.c(this.f45766a, (ModalBottomSheetState) this.f45772g, r3, z, pVar, (Composer) obj, iUpdateChangedFlags, i2);
            return h.ab.f48028a;
        }
        ((Integer) obj2).intValue();
        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f45769d | 1);
        int i3 = this.f45770e;
        h.g.a.p pVar2 = this.f45768c;
        ?? r32 = this.f45772g;
        boolean z2 = this.f45767b;
        y.d(this.f45766a, (ab) this.f45771f, z2, r32, pVar2, (Composer) obj, iUpdateChangedFlags2, i3);
        return h.ab.f48028a;
    }

    public /* synthetic */ r(Modifier modifier, ab abVar, boolean z, MutableInteractionSource mutableInteractionSource, h.g.a.p pVar, int i2, int i3, int i4) {
        this.f45773h = i4;
        this.f45766a = modifier;
        this.f45771f = abVar;
        this.f45767b = z;
        this.f45772g = mutableInteractionSource;
        this.f45768c = pVar;
        this.f45769d = i2;
        this.f45770e = i3;
    }
}
