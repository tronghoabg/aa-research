package com.waze.sound;

import androidx.media3.exoplayer.ExoPlayer;
import com.waze.jni.protos.sound.VoiceAssetRequest;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dz extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f39830a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f39831b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f39832c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f39833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dz(VoiceAssetsNativeManager voiceAssetsNativeManager, VoiceAssetRequest voiceAssetRequest, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39833d = i2;
        this.f39831b = voiceAssetsNativeManager;
        this.f39832c = voiceAssetRequest;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.media3.exoplayer.ExoPlayer, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f39833d;
        if (i2 == 0) {
            return new dz((eb) this.f39831b, (ak) this.f39832c, eVar, 0);
        }
        if (i2 == 1) {
            return new dz((gr) this.f39831b, (dr) this.f39832c, eVar, 1);
        }
        if (i2 == 2) {
            return new dz((el) this.f39832c, (CompletableDeferred) this.f39831b, eVar, 2);
        }
        if (i2 == 3) {
            return new dz((el) this.f39832c, this.f39831b, eVar, 3, null);
        }
        if (i2 == 4) {
            return new dz((hl) this.f39831b, (ExoPlayer) this.f39832c, eVar, 4);
        }
        if (i2 != 5) {
            return new dz((ii) this.f39832c, (String) this.f39831b, eVar, 6);
        }
        return new dz((VoiceAssetsNativeManager) this.f39831b, (VoiceAssetRequest) this.f39832c, eVar, 5);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f39833d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? ((dz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((dz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((dz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((dz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((dz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((dz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((dz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e4, code lost:
    
        if (com.waze.sound.dr.k((com.waze.sound.dr) r2, (com.waze.sound.go) r8, r7) == r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f8, code lost:
    
        if (((com.waze.sound.dr) r8).F(r7) == r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01fa, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.media3.exoplayer.ExoPlayer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.dz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dz(eb ebVar, ak akVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39833d = i2;
        this.f39831b = ebVar;
        this.f39832c = akVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dz(el elVar, CompletableDeferred completableDeferred, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39833d = i2;
        this.f39832c = elVar;
        this.f39831b = completableDeferred;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dz(el elVar, CompletableDeferred completableDeferred, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f39833d = i2;
        this.f39832c = elVar;
        this.f39831b = completableDeferred;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dz(gr grVar, dr drVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39833d = i2;
        this.f39831b = grVar;
        this.f39832c = drVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dz(hl hlVar, ExoPlayer exoPlayer, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39833d = i2;
        this.f39831b = hlVar;
        this.f39832c = exoPlayer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dz(ii iiVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39833d = i2;
        this.f39832c = iiVar;
        this.f39831b = str;
    }
}
