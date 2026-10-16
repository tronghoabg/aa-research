package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MappedInteractionSource implements InteractionSource {
    public static final int $stable = 0;
    private final a<Offset> calculateDelta;
    private final k<Interaction> interactions;
    private final Map<PressInteraction.Press, PressInteraction.Press> mappedPresses = new LinkedHashMap();

    public MappedInteractionSource(InteractionSource interactionSource, a<Offset> aVar) {
        this.calculateDelta = aVar;
        final k<Interaction> interactions = interactionSource.getInteractions();
        this.interactions = new k<Interaction>() { // from class: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements l {
                final /* synthetic */ l $this_unsafeFlow;
                final /* synthetic */ MappedInteractionSource this$0;

                /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(e eVar) {
                        super(eVar);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(l lVar, MappedInteractionSource mappedInteractionSource) {
                    this.$this_unsafeFlow = lVar;
                    this.this$0 = mappedInteractionSource;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.b.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, h.c.e r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = (androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = new androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        h.c.a.a r1 = h.c.a.a.f48038a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L30
                        if (r2 != r3) goto L28
                        e.b.c.b(r7)
                        goto L9c
                    L28:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L30:
                        e.b.c.b(r7)
                        kotlinx.coroutines.b.l r7 = r5.$this_unsafeFlow
                        r2 = r0
                        h.c.e r2 = (h.c.e) r2
                        androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                        if (r2 == 0) goto L54
                        androidx.compose.material3.internal.MappedInteractionSource r2 = r5.this$0
                        r4 = r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = (androidx.compose.foundation.interaction.PressInteraction.Press) r4
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = androidx.compose.material3.internal.MappedInteractionSource.access$mapPress(r2, r4)
                        androidx.compose.material3.internal.MappedInteractionSource r5 = r5.this$0
                        java.util.Map r5 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r5)
                        r5.put(r6, r2)
                        r6 = r2
                        androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                        goto L93
                    L54:
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                        if (r2 == 0) goto L74
                        androidx.compose.material3.internal.MappedInteractionSource r5 = r5.this$0
                        java.util.Map r5 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r5)
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = r6.getPress()
                        java.lang.Object r5 = r5.remove(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Press r5 = (androidx.compose.foundation.interaction.PressInteraction.Press) r5
                        if (r5 == 0) goto L71
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                        r6.<init>(r5)
                    L71:
                        androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                        goto L93
                    L74:
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                        if (r2 == 0) goto L93
                        androidx.compose.material3.internal.MappedInteractionSource r5 = r5.this$0
                        java.util.Map r5 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r5)
                        androidx.compose.foundation.interaction.PressInteraction$Release r6 = (androidx.compose.foundation.interaction.PressInteraction.Release) r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = r6.getPress()
                        java.lang.Object r5 = r5.remove(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Press r5 = (androidx.compose.foundation.interaction.PressInteraction.Press) r5
                        if (r5 == 0) goto L91
                        androidx.compose.foundation.interaction.PressInteraction$Release r6 = new androidx.compose.foundation.interaction.PressInteraction$Release
                        r6.<init>(r5)
                    L91:
                        androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                    L93:
                        r0.label = r3
                        java.lang.Object r5 = r7.emit(r6, r0)
                        if (r5 != r1) goto L9c
                        return r1
                    L9c:
                        h.ab r5 = h.ab.f48028a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.b.k
            public Object collect(l<? super Interaction> lVar, e eVar) {
                Object objCollect = interactions.collect(new AnonymousClass2(lVar, this), eVar);
                return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PressInteraction.Press mapPress(PressInteraction.Press press) {
        return new PressInteraction.Press(Offset.m7984minusMKHz9U(press.m2381getPressPositionF1C5BW0(), this.calculateDelta.invoke().m7990unboximpl()), null);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public k<Interaction> getInteractions() {
        return this.interactions;
    }
}
