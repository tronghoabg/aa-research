package com.waze.sound;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.waze.lm;
import j$.util.Objects;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f39516a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39517b;

    bc(bg bgVar, int i2, byte[] bArr) {
        this.f39517b = i2;
        Objects.requireNonNull(bgVar);
        this.f39516a = bgVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        int i2 = this.f39517b;
        if (i2 == 0) {
            String strValueOf = String.valueOf(SoundNativeManager.getInstance().getCustomPromptsTempRecordPath());
            bg bgVar = (bg) this.f39516a;
            bgVar.f39522c = strValueOf.concat(DomExceptionUtils.SEPARATOR);
            bgVar.f39521b = SoundNativeManager.getInstance().getPromptDefinitions();
            com.waze.shared_infra.i.h.h("CustomPrompts: Prompts manager initialized. path = ".concat(String.valueOf(bgVar.f39522c)));
            File file = new File(bgVar.f39522c);
            if (file.exists() || ContextCompat.checkSelfPermission(lm.d().e(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                return;
            }
            com.waze.shared_infra.i.h.h("CustomPrompts: Mkdrs success = " + file.mkdirs());
            return;
        }
        if (i2 != 1) {
            Object obj = this.f39516a;
            if (i2 != 2) {
                ((cw) obj).f39727j.setVisibility(0);
                return;
            }
            cw cwVar = (cw) obj;
            if (cwVar.getParent() == null) {
                return;
            }
            ((ViewGroup) cwVar.getParent()).removeView((View) obj);
            if (cwVar.q != null) {
                cwVar.q.a();
                return;
            }
            return;
        }
        Object obj2 = this.f39516a;
        if (((bg) obj2).f39525f) {
            com.waze.shared_infra.i.h.h("CustomPrompts: Finished recording");
            try {
                ((bg) obj2).f39523d.stop();
            } catch (RuntimeException unused) {
                com.waze.shared_infra.i.h.c("Stop exception occured, ignoring");
            }
            bg bgVar2 = (bg) this.f39516a;
            bgVar2.f39523d.release();
            if (bgVar2.f39526g) {
                bgVar2.f39526g = false;
                bgVar2.m(bgVar2.f39527h.getId(), true);
            }
            bgVar2.f39527h = null;
            bgVar2.f39525f = false;
            if (bgVar2.f39529j != null) {
                cq cqVar = (cq) bgVar2.f39529j;
                cqVar.f39711a.post(new cp(cqVar));
            }
            bgVar2.f39529j = null;
        }
    }

    bc(bg bgVar, int i2) {
        this.f39517b = i2;
        Objects.requireNonNull(bgVar);
        this.f39516a = bgVar;
    }

    bc(cw cwVar, int i2) {
        this.f39517b = i2;
        Objects.requireNonNull(cwVar);
        this.f39516a = cwVar;
    }

    bc(cw cwVar, int i2, byte[] bArr) {
        this.f39517b = i2;
        Objects.requireNonNull(cwVar);
        this.f39516a = cwVar;
    }
}
