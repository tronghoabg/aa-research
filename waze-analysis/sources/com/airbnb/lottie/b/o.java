package com.airbnb.lottie.b;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class o {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final com.airbnb.lottie.h r31, androidx.compose.ui.Modifier r32, boolean r33, boolean r34, float r35, int r36, com.airbnb.lottie.ag r37, boolean r38, com.airbnb.lottie.b.ae r39, androidx.compose.ui.Alignment r40, androidx.compose.ui.layout.ContentScale r41, boolean r42, com.airbnb.lottie.a r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.o.b(com.airbnb.lottie.h, androidx.compose.ui.Modifier, boolean, boolean, float, int, com.airbnb.lottie.ag, boolean, com.airbnb.lottie.b.ae, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, boolean, com.airbnb.lottie.a, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0445 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final com.airbnb.lottie.h r26, final h.g.a.a r27, androidx.compose.ui.Modifier r28, com.airbnb.lottie.ag r29, com.airbnb.lottie.b.ae r30, androidx.compose.ui.Alignment r31, androidx.compose.ui.layout.ContentScale r32, boolean r33, com.airbnb.lottie.a r34, androidx.compose.runtime.Composer r35, final int r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.o.c(com.airbnb.lottie.h, h.g.a.a, androidx.compose.ui.Modifier, com.airbnb.lottie.ag, com.airbnb.lottie.b.ae, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, boolean, com.airbnb.lottie.a, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static Paint.Cap d(int i2) {
        int i3 = i2 - 1;
        return i3 != 0 ? i3 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
    }

    public static final Object f(b bVar, h.c.e eVar) {
        float fK = k(bVar.i(), bVar.j(), bVar.e());
        Object objB = bVar.b(bVar.i(), fK, fK != bVar.d(), eVar);
        return objB == h.c.a.a.f48038a ? objB : h.ab.f48028a;
    }

    public static final b g(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2024497114, 0, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        k kVarRememberedValue = composer.rememberedValue();
        if (kVarRememberedValue == Composer.Companion.getEmpty()) {
            kVarRememberedValue = new k();
            composer.updateRememberedValue(kVarRememberedValue);
        }
        b bVar = (b) kVarRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4 A[PHI: r13
  0x00e4: PHI (r13v14 int) = (r13v12 int), (r13v15 int) binds: [B:45:0x00e2, B:41:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.airbnb.lottie.b.s h(com.airbnb.lottie.h r17, boolean r18, boolean r19, boolean r20, float r21, int r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.o.h(com.airbnb.lottie.h, boolean, boolean, boolean, float, int, androidx.compose.runtime.Composer, int, int):com.airbnb.lottie.b.s");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final ae i(MutableState mutableState) {
        return (ae) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.ab j(Rect rect, ContentScale contentScale, Alignment alignment, Matrix matrix, com.airbnb.lottie.s sVar, com.airbnb.lottie.ag agVar, com.airbnb.lottie.a aVar, com.airbnb.lottie.h hVar, ae aeVar, boolean z, h.g.a.a aVar2, MutableState mutableState, DrawScope drawScope) {
        h.g.b.x.f(drawScope, "$this$Canvas");
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        float fWidth = rect.width();
        float fHeight = rect.height();
        long jFloatToRawIntBits = Float.floatToRawIntBits(fWidth);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fHeight);
        int iB = h.h.a.b(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)));
        int iB2 = h.h.a.b(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        long j2 = (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
        long jMo9734computeScaleFactorH7hwNQA = contentScale.mo9734computeScaleFactorH7hwNQA(j2, drawScope.mo8751getSizeNHjbRc());
        long j3 = jMo9734computeScaleFactorH7hwNQA >> 32;
        long j4 = jMo9734computeScaleFactorH7hwNQA & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        int i2 = (int) j3;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat(i2);
        int i3 = (int) j4;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * Float.intBitsToFloat(i3);
        long jMo7648alignKFBX0sM = alignment.mo7648alignKFBX0sM((((int) fIntBitsToFloat) << 32) | (((int) fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (iB << 32) | (iB2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), drawScope.getLayoutDirection());
        matrix.reset();
        matrix.preTranslate(IntOffset.m11296getXimpl(jMo7648alignKFBX0sM), IntOffset.m11297getYimpl(jMo7648alignKFBX0sM));
        matrix.preScale(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        sVar.t(false);
        sVar.H(agVar);
        sVar.z(aVar);
        sVar.S(hVar);
        if (aeVar != i(mutableState)) {
            ae aeVarI = i(mutableState);
            if (aeVarI != null) {
                aeVarI.b(sVar);
            }
            if (aeVar != null) {
                aeVar.a(sVar);
            }
            mutableState.setValue(aeVar);
        }
        sVar.B(z);
        sVar.A(false);
        sVar.G(((Number) aVar2.invoke()).floatValue());
        sVar.setBounds(0, 0, rect.width(), rect.height());
        sVar.s(AndroidCanvas_androidKt.getNativeCanvas(canvas), matrix);
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(com.airbnb.lottie.h hVar, u uVar, float f2) {
        if (f2 < 0.0f && hVar == null) {
            return 1.0f;
        }
        if (hVar == null) {
            return 0.0f;
        }
        if (f2 < 0.0f) {
            if (uVar == null) {
                return 1.0f;
            }
            u.a(hVar);
            return 1.0f;
        }
        if (uVar == null) {
            return 0.0f;
        }
        u.b(hVar);
        return 0.0f;
    }
}
