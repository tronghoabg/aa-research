package com.bykv.vk.openvk.uef.uef.oa.yo;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class oa extends com.bykv.vk.openvk.uef.uef.oa.yo.uef {
    private final Object ivm;
    private Surface lw;
    private com.bykv.vk.openvk.uef.uef.oa.uef.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private final MediaPlayer f24510oa;
    private volatile boolean xs;
    private final uef yo;

    public static class uef implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<oa> uef;

        public uef(oa oaVar) {
            this.uef = new WeakReference<>(oaVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i5) {
            try {
                oa oaVar = this.uef.get();
                if (oaVar != null) {
                    oaVar.uef(i5);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                oa oaVar = this.uef.get();
                if (oaVar != null) {
                    oaVar.yo();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i5, int i10) {
            try {
                oa oaVar = this.uef.get();
                if (oaVar != null) {
                    return oaVar.uef(i5, i10);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i5, int i10) {
            try {
                oa oaVar = this.uef.get();
                if (oaVar != null) {
                    return oaVar.oa(i5, i10);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                oa oaVar = this.uef.get();
                if (oaVar != null) {
                    oaVar.oa();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                oa oaVar = this.uef.get();
                if (oaVar != null) {
                    oaVar.moa();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i5, int i10) {
            try {
                oa oaVar = this.uef.get();
                if (oaVar != null) {
                    oaVar.uef(i5, i10, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public oa() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.ivm = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f24510oa = mediaPlayer;
        }
        uef(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.yo = new uef(this);
        bs();
    }

    private void ab() {
        com.bykv.vk.openvk.uef.uef.oa.uef.uef uefVar = this.moa;
        if (uefVar != null) {
            try {
                uefVar.close();
            } catch (Throwable unused) {
            }
            this.moa = null;
        }
    }

    private void bs() {
        this.f24510oa.setOnPreparedListener(this.yo);
        this.f24510oa.setOnBufferingUpdateListener(this.yo);
        this.f24510oa.setOnCompletionListener(this.yo);
        this.f24510oa.setOnSeekCompleteListener(this.yo);
        this.f24510oa.setOnVideoSizeChangedListener(this.yo);
        this.f24510oa.setOnErrorListener(this.yo);
        this.f24510oa.setOnInfoListener(this.yo);
    }

    private void sy() {
        try {
            Surface surface = this.lw;
            if (surface != null) {
                surface.release();
                this.lw = null;
            }
        } catch (Throwable unused) {
        }
    }

    private void uef(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.uef.uef.uef.yo.uef(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void bcc() throws Throwable {
        this.f24510oa.pause();
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void cq() throws Throwable {
        try {
            this.f24510oa.reset();
        } catch (Throwable unused) {
        }
        ab();
        uef();
        bs();
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void cz() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f24510oa;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public long dj() {
        try {
            return this.f24510oa.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public int dz() {
        MediaPlayer mediaPlayer = this.f24510oa;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public void finalize() throws Throwable {
        super.finalize();
        sy();
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void ivm() throws Throwable {
        this.f24510oa.start();
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public PlaybackParams lw() throws IllegalStateException {
        return this.f24510oa.getPlaybackParams();
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void moa(boolean z2) throws Throwable {
        MediaPlayer mediaPlayer = this.f24510oa;
        if (mediaPlayer == null) {
            return;
        }
        if (z2) {
            mediaPlayer.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void oa(boolean z2) throws Throwable {
        this.f24510oa.setScreenOnWhilePlaying(z2);
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public int wk() {
        MediaPlayer mediaPlayer = this.f24510oa;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void wrv() throws Throwable {
        synchronized (this.ivm) {
            try {
                if (!this.xs) {
                    this.f24510oa.release();
                    this.xs = true;
                    sy();
                    ab();
                    uef();
                    bs();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void xs() throws Throwable {
        this.f24510oa.stop();
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void yo(boolean z2) throws Throwable {
        this.f24510oa.setLooping(z2);
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public long zjm() {
        try {
            return this.f24510oa.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void uef(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.ivm) {
            try {
                if (!this.xs && surfaceHolder != null && surfaceHolder.getSurface() != null && this.uef) {
                    this.f24510oa.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void uef(Surface surface) {
        sy();
        this.lw = surface;
        this.f24510oa.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void uef(com.bykv.vk.openvk.uef.uef.uef.oa oaVar) throws Throwable {
        this.f24510oa.setPlaybackParams(this.f24510oa.getPlaybackParams().setSpeed(oaVar.uef()));
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void uef(String str) throws Throwable {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.f24510oa.setDataSource(uri.getPath());
        } else {
            this.f24510oa.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void uef(FileDescriptor fileDescriptor) throws Throwable {
        this.f24510oa.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public synchronized void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        this.moa = com.bykv.vk.openvk.uef.uef.oa.uef.uef.uef(com.bykv.vk.openvk.uef.uef.uef.yo.uef(), yoVar);
        com.bykv.vk.openvk.uef.uef.oa.uef.oa.yo.uef(yoVar);
        this.f24510oa.setDataSource(this.moa);
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void uef(long j8, int i5) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.f24510oa.seekTo((int) j8);
            return;
        }
        if (i5 == 0) {
            this.f24510oa.seekTo((int) j8, 0);
            return;
        }
        if (i5 == 1) {
            this.f24510oa.seekTo((int) j8, 1);
            return;
        }
        if (i5 == 2) {
            this.f24510oa.seekTo((int) j8, 2);
        } else if (i5 == 3) {
            this.f24510oa.seekTo((int) j8, 3);
        } else {
            this.f24510oa.seekTo((int) j8);
        }
    }
}
