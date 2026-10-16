package U1;

import E5.C0445d;
import E5.C0466p;
import N1.C0754c;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import k8.InterfaceC3207p;

/* renamed from: U1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0833c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3207p f12022a;

    /* renamed from: b, reason: collision with root package name */
    public final C0445d f12023b;

    /* renamed from: c, reason: collision with root package name */
    public r f12024c;

    /* renamed from: d, reason: collision with root package name */
    public C0754c f12025d;

    /* renamed from: f, reason: collision with root package name */
    public int f12027f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f12029h;

    /* renamed from: g, reason: collision with root package name */
    public float f12028g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f12026e = 0;

    public C0833c(Context context, Handler handler, r rVar) {
        this.f12022a = S3.f.z(new C0466p(context, 4));
        this.f12024c = rVar;
        this.f12023b = new C0445d(this, handler, 1);
    }

    public final void a() {
        int i5 = this.f12026e;
        if (i5 == 1 || i5 == 0) {
            return;
        }
        int i10 = Q1.x.f9724a;
        InterfaceC3207p interfaceC3207p = this.f12022a;
        if (i10 < 26) {
            ((AudioManager) interfaceC3207p.get()).abandonAudioFocus(this.f12023b);
        } else if (this.f12029h != null) {
            ((AudioManager) interfaceC3207p.get()).abandonAudioFocusRequest(this.f12029h);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(N1.C0754c r7) {
        /*
            r6 = this;
            N1.c r0 = r6.f12025d
            int r1 = Q1.x.f9724a
            boolean r0 = j$.util.Objects.equals(r0, r7)
            if (r0 != 0) goto L3d
            r6.f12025d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L12
        L10:
            r2 = r0
            goto L31
        L12:
            r2 = 3
            r3 = 2
            java.lang.String r4 = "AudioFocusManager"
            int r5 = r7.f8142c
            switch(r5) {
                case 0: goto L2b;
                case 1: goto L29;
                case 2: goto L27;
                case 3: goto L10;
                case 4: goto L27;
                case 5: goto L31;
                case 6: goto L31;
                case 7: goto L31;
                case 8: goto L31;
                case 9: goto L31;
                case 10: goto L31;
                case 11: goto L23;
                case 12: goto L31;
                case 13: goto L31;
                case 14: goto L29;
                case 15: goto L1b;
                case 16: goto L21;
                default: goto L1b;
            }
        L1b:
            java.lang.String r7 = "Unidentified audio usage: "
            N0.a.o(r5, r7, r4)
            goto L10
        L21:
            r2 = 4
            goto L31
        L23:
            int r7 = r7.f8140a
            if (r7 != r1) goto L31
        L27:
            r2 = r3
            goto L31
        L29:
            r2 = r1
            goto L31
        L2b:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            Q1.k.w(r4, r7)
            goto L29
        L31:
            r6.f12027f = r2
            if (r2 == r1) goto L37
            if (r2 != 0) goto L38
        L37:
            r0 = r1
        L38:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            Q1.k.b(r7, r0)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C0833c.b(N1.c):void");
    }

    public final void c(int i5) {
        if (this.f12026e == i5) {
            return;
        }
        this.f12026e = i5;
        float f10 = i5 == 4 ? 0.2f : 1.0f;
        if (this.f12028g == f10) {
            return;
        }
        this.f12028g = f10;
        r rVar = this.f12024c;
        if (rVar != null) {
            C0850u c0850u = rVar.f12116a;
            c0850u.D0(1, 2, Float.valueOf(c0850u.f12141V * c0850u.f12174y.f12028g));
        }
    }

    public final int d(int i5, boolean z2) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderJ;
        int i10 = 0;
        z = false;
        boolean z10 = false;
        if (i5 == 1 || this.f12027f != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z2) {
            int i11 = this.f12026e;
            if (i11 == 1) {
                return -1;
            }
            if (i11 == 3) {
                return 0;
            }
        } else if (this.f12026e != 2) {
            int i12 = Q1.x.f9724a;
            InterfaceC3207p interfaceC3207p = this.f12022a;
            C0445d c0445d = this.f12023b;
            if (i12 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f12029h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        A0.h.m();
                        builderJ = A0.h.f(this.f12027f);
                    } else {
                        A0.h.m();
                        builderJ = A0.h.j(this.f12029h);
                    }
                    C0754c c0754c = this.f12025d;
                    if (c0754c != null && c0754c.f8140a == 1) {
                        z10 = true;
                    }
                    c0754c.getClass();
                    this.f12029h = builderJ.setAudioAttributes((AudioAttributes) c0754c.a().f48001b).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(c0445d).build();
                }
                iRequestAudioFocus = ((AudioManager) interfaceC3207p.get()).requestAudioFocus(this.f12029h);
            } else {
                AudioManager audioManager = (AudioManager) interfaceC3207p.get();
                C0754c c0754c2 = this.f12025d;
                c0754c2.getClass();
                int i13 = c0754c2.f8142c;
                if (i13 != 13) {
                    switch (i13) {
                        case 2:
                            break;
                        case 3:
                            i10 = 8;
                            break;
                        case 4:
                            i10 = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i10 = 5;
                            break;
                        case 6:
                            i10 = 2;
                            break;
                        default:
                            i10 = 3;
                            break;
                    }
                } else {
                    i10 = 1;
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(c0445d, i10, this.f12027f);
            }
            if (iRequestAudioFocus == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
