package com.waze.sound;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.os.Handler;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.mg;
import java.io.File;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    private static bg f39520a;

    /* renamed from: c, reason: collision with root package name */
    private String f39522c;

    /* renamed from: d, reason: collision with root package name */
    private MediaRecorder f39523d;

    /* renamed from: e, reason: collision with root package name */
    private long f39524e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f39525f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f39526g;

    /* renamed from: h, reason: collision with root package name */
    private PromptDefinition f39527h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39528i;

    /* renamed from: j, reason: collision with root package name */
    private bf f39529j;

    /* renamed from: b, reason: collision with root package name */
    private PromptDefinition[] f39521b = null;

    /* renamed from: k, reason: collision with root package name */
    private boolean f39530k = false;

    /* renamed from: l, reason: collision with root package name */
    private final Handler f39531l = new Handler();
    private final Runnable m = new bc(this, 1, (byte[]) null);

    private bg() {
    }

    private final String E(String str, boolean z) {
        String str2 = this.f39522c;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        sb.append(true != z ? "" : "_temp");
        sb.append(".mp3");
        return sb.toString();
    }

    public static synchronized bg c() {
        bg bgVar;
        bgVar = f39520a;
        if (bgVar == null) {
            bgVar = new bg();
            f39520a = bgVar;
        }
        return bgVar;
    }

    public static /* synthetic */ h.ab f(bg bgVar, Runnable runnable) {
        bgVar.f39528i = false;
        if (runnable != null) {
            runnable.run();
            com.waze.t.l(runnable);
        }
        return h.ab.f48028a;
    }

    public final long D(String str) throws IllegalArgumentException {
        String strE = E(str, true);
        if (!new File(strE).exists()) {
            return 0L;
        }
        new MediaMetadataRetriever().setDataSource(strE);
        return Integer.parseInt(r2.extractMetadata(9));
    }

    public final void i(PromptDefinition promptDefinition, bf bfVar) {
        if (this.f39525f) {
            return;
        }
        com.waze.shared_infra.i.h.h("CustomPrompts: Starting to record: ".concat(String.valueOf(promptDefinition.getId())));
        String str = this.f39522c + promptDefinition.getId() + "_temp.mp3";
        this.f39529j = bfVar;
        this.f39527h = promptDefinition;
        this.f39526g = false;
        this.f39525f = true;
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f39523d = mediaRecorder;
        mediaRecorder.setAudioSource(1);
        this.f39523d.setOutputFormat(2);
        this.f39523d.setOutputFile(str);
        this.f39523d.setAudioEncoder(3);
        this.f39523d.setMaxDuration(promptDefinition.getMaxSeconds() * 1000);
        try {
            this.f39523d.prepare();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        this.f39524e = System.currentTimeMillis();
        this.f39523d.start();
        ((cq) bfVar).f39711a.r(1.0f, r4.f39729l.getMaxSeconds() * 1000);
        this.f39531l.postDelayed(this.m, this.f39527h.getMaxSeconds() * 1000);
    }

    public final void j() {
        NativeManager.Post(new be(this));
    }

    public final void k() {
        Context contextA = mg.a();
        if (contextA != null) {
            File file = new File(String.valueOf(String.valueOf(contextA.getFilesDir())).concat("/custom_recordings/"));
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && (fileArrListFiles.length) > 0) {
                    com.waze.shared_infra.i.h.h("CustomPrompts: Legacy folder exists and has files. Creating custom prompt set in new system");
                    for (File file2 : fileArrListFiles) {
                        file2.renameTo(new File(this.f39522c, file2.getName()));
                    }
                    p(com.waze.shared_infra.o.b.a().c(R.string.VOICE_PROMPT_LEGACY_PROMPT_SET_NAME, new Object[0]), false);
                }
                file.delete();
            }
        }
    }

    public final void l() {
        File file = new File(this.f39522c);
        String[] list = file.list();
        if (list != null) {
            for (String str : list) {
                new File(file, str).delete();
            }
        }
    }

    public final void m(String str, boolean z) {
        new File(E(str, z)).delete();
    }

    public final void n() {
        if (this.f39530k) {
            return;
        }
        this.f39530k = true;
        NativeManager.Post(new bc(this, 0));
    }

    public final void o(String str) {
        File file = new File(this.f39522c + str + "_temp.mp3");
        if (!file.exists()) {
            com.waze.shared_infra.i.h.h("CustomPrompts: temp file not found: ".concat(String.valueOf(str)));
            return;
        }
        File file2 = new File(this.f39522c + str + ".mp3");
        com.waze.shared_infra.i.h.h("CustomPrompts: save file success = " + file.renameTo(file2) + ", file size = " + file2.length());
    }

    public final void p(String str, boolean z) {
        NativeManager.Post(new bd(this, z, str));
    }

    public final void q(boolean z) {
        if (this.f39525f) {
            Handler handler = this.f39531l;
            Runnable runnable = this.m;
            handler.removeCallbacks(runnable);
            this.f39526g = z;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f39524e;
            if (jCurrentTimeMillis < 500) {
                handler.postDelayed(runnable, 500 - jCurrentTimeMillis);
            } else {
                runnable.run();
            }
        }
    }

    public final boolean t(String str, boolean z) {
        return new File(E(str, z)).exists();
    }

    public final boolean u() {
        File[] fileArrListFiles = new File(this.f39522c).listFiles();
        if (fileArrListFiles != null && (fileArrListFiles.length) > 0) {
            for (File file : fileArrListFiles) {
                if (file.getName().endsWith("mp3")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        return this.f39525f;
    }

    public final boolean w(PromptDefinition promptDefinition) {
        return this.f39527h == promptDefinition;
    }

    public final boolean x(String str, boolean z, Runnable runnable) {
        if (this.f39528i) {
            return false;
        }
        this.f39528i = true;
        com.waze.sharedui.e.e.g().c(E(str, z), null, true, false, new com.waze.search.h.az(this, runnable, 9));
        return true;
    }

    public final PromptDefinition[] y() {
        return this.f39521b;
    }
}
