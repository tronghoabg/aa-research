package androidx.compose.material3.internal.ripple;

import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.internal.ripple.RippleNodeConfig;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CommonRippleNode extends RippleNode {
    public static final int $stable = 8;
    private final MutableScatterMap<PressInteraction.Press, RippleAnimation> ripples;

    private CommonRippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, a<RippleNodeConfig> aVar) {
        super(interactionSource, z, f2, colorProducer, aVar, null);
        this.ripples = new MutableScatterMap<>(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    @Override // androidx.compose.material3.internal.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo6390addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction.Press r19, long r20, float r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.collection.MutableScatterMap<androidx.compose.foundation.interaction.PressInteraction$Press, androidx.compose.material3.internal.ripple.RippleAnimation> r2 = r0.ripples
            androidx.collection.ScatterMap r2 = (androidx.collection.ScatterMap) r2
            java.lang.Object[] r3 = r2.keys
            java.lang.Object[] r4 = r2.values
            long[] r2 = r2.metadata
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L53
            r6 = 0
            r7 = r6
        L15:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4e
            int r10 = r7 - r5
            r11 = r6
        L28:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L4c
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L48
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r3[r12]
            r12 = r4[r12]
            androidx.compose.material3.internal.ripple.RippleAnimation r12 = (androidx.compose.material3.internal.ripple.RippleAnimation) r12
            androidx.compose.foundation.interaction.PressInteraction$Press r14 = (androidx.compose.foundation.interaction.PressInteraction.Press) r14
            r12.finish()
        L48:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L28
        L4c:
            if (r12 != r13) goto L53
        L4e:
            if (r7 == r5) goto L53
            int r7 = r7 + 1
            goto L15
        L53:
            boolean r2 = r0.getBounded()
            r3 = 0
            if (r2 == 0) goto L63
            long r4 = r1.m2381getPressPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.m7969boximpl(r4)
            goto L64
        L63:
            r2 = r3
        L64:
            androidx.compose.material3.internal.ripple.RippleAnimation r4 = new androidx.compose.material3.internal.ripple.RippleAnimation
            boolean r5 = r0.getBounded()
            r6 = r22
            r4.<init>(r2, r6, r5, r3)
            androidx.collection.MutableScatterMap<androidx.compose.foundation.interaction.PressInteraction$Press, androidx.compose.material3.internal.ripple.RippleAnimation> r2 = r0.ripples
            r2.set(r1, r4)
            kotlinx.coroutines.af r2 = r0.getCoroutineScope()
            androidx.compose.material3.internal.ripple.CommonRippleNode$addRipple$2 r5 = new androidx.compose.material3.internal.ripple.CommonRippleNode$addRipple$2
            r5.<init>(r4, r0, r1, r3)
            h.g.a.p r5 = (h.g.a.p) r5
            r1 = 3
            kotlinx.coroutines.aj.z(r2, r3, r3, r5, r1)
            androidx.compose.ui.node.DrawModifierNode r0 = (androidx.compose.ui.node.DrawModifierNode) r0
            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.ripple.CommonRippleNode.mo6390addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction$Press, long, float):void");
    }

    @Override // androidx.compose.material3.internal.ripple.RippleNode
    public void drawRipples(DrawScope drawScope) {
        float f2;
        int i2;
        int i3;
        char c2;
        float f3;
        RippleNodeConfig.Press press = getRippleNodeConfig().invoke().getPress();
        float alpha = press instanceof RippleNodeConfig.Press.Opacity ? ((RippleNodeConfig.Press.Opacity) press).getAlpha() : 0.0f;
        if (alpha == 0.0f) {
            return;
        }
        CommonRippleNode commonRippleNode = this;
        MutableScatterMap<PressInteraction.Press, RippleAnimation> mutableScatterMap = commonRippleNode.ripples;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j2 = jArr[i4];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i4 - length;
                long j3 = j2;
                int i6 = 0;
                while (true) {
                    i2 = 8 - ((~i5) >>> 31);
                    if (i6 >= i2) {
                        break;
                    }
                    if ((j3 & 255) < 128) {
                        int i7 = (i4 << 3) + i6;
                        Object obj = objArr[i7];
                        RippleAnimation rippleAnimation = (RippleAnimation) objArr2[i7];
                        int i8 = i6;
                        long jM6402getRippleColor0d7_KjU = commonRippleNode.m6402getRippleColor0d7_KjU();
                        i3 = i8;
                        c2 = '\b';
                        f3 = alpha;
                        rippleAnimation.m6396draw4WTKRHQ(drawScope, Color.m8227copywmQWz5c$default(jM6402getRippleColor0d7_KjU, alpha, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        i3 = i6;
                        c2 = '\b';
                        f3 = alpha;
                    }
                    j3 >>= c2;
                    i6 = i3 + 1;
                    commonRippleNode = this;
                    alpha = f3;
                }
                f2 = alpha;
                if (i2 != 8) {
                    return;
                }
            } else {
                f2 = alpha;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            commonRippleNode = this;
            alpha = f2;
        }
    }

    @Override // androidx.compose.material3.internal.ripple.RippleNode, androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.ripples.clear();
    }

    @Override // androidx.compose.material3.internal.ripple.RippleNode
    public void removeRipple(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = this.ripples.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    public /* synthetic */ CommonRippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, a aVar, o oVar) {
        this(interactionSource, z, f2, colorProducer, aVar);
    }
}
