package com.carstream.tech.launcher;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import defpackage.r;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class MediaHub {
    private Cb cb;
    private Context ctx;
    private MediaController cur;
    private ComponentName listener;
    private MediaSessionManager msm;
    private final Handler h = new Handler(Looper.getMainLooper());
    private final Info info = new Info();
    private int dbg = 0;
    private final MediaSessionManager.OnActiveSessionsChangedListener sessionsChanged = new MediaSessionManager.OnActiveSessionsChangedListener() { // from class: com.carstream.tech.launcher.MediaHub.1
        @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
        public void onActiveSessionsChanged(List<MediaController> list) {
            MediaHub.this.pick(list);
        }
    };
    private final MediaController.Callback ctrlCb = new MediaController.Callback() { // from class: com.carstream.tech.launcher.MediaHub.2
        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            MediaHub.this.read();
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            MediaHub.this.read();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            MediaHub.this.refresh();
        }
    };

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface Cb {
        void onMedia(Info info);
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Info {
        public boolean any;
        public Bitmap art;
        public String artist;
        public boolean denied;
        public String pkg;
        public boolean playing;
        public float pos = -1.0f;
        public String title;
    }

    private void detach() {
        try {
            MediaController mediaController = this.cur;
            if (mediaController != null) {
                mediaController.unregisterCallback(this.ctrlCb);
            }
        } catch (Throwable unused) {
        }
        this.cur = null;
    }

    private void emit() {
        if (this.cb != null) {
            this.h.post(new r(this, 5));
        }
    }

    private static String first(MediaMetadata mediaMetadata, String... strArr) {
        for (String str : strArr) {
            CharSequence text = mediaMetadata.getText(str);
            if (text != null && text.length() > 0) {
                return text.toString();
            }
        }
        return null;
    }

    private static Bitmap firstBitmap(MediaMetadata mediaMetadata, String... strArr) {
        Bitmap bitmap;
        for (String str : strArr) {
            try {
                bitmap = mediaMetadata.getBitmap(str);
            } catch (Throwable unused) {
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$emit$0() {
        this.cb.onMedia(this.info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pick(List<MediaController> list) {
        int i = this.dbg;
        this.dbg = i + 1;
        if (i < 6 || (list != null && !list.isEmpty())) {
            if (list != null) {
                list.size();
            }
            if (list != null && !list.isEmpty()) {
                new StringBuilder(" -> ").append(list.get(0).getPackageName());
            }
        }
        MediaController mediaController = null;
        if (list != null) {
            Iterator<MediaController> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MediaController next = it.next();
                PlaybackState playbackState = next.getPlaybackState();
                if (playbackState != null && playbackState.getState() == 3) {
                    mediaController = next;
                    break;
                }
            }
            if (mediaController == null && !list.isEmpty()) {
                mediaController = list.get(0);
            }
        }
        if (mediaController == null) {
            detach();
            this.info.any = false;
            emit();
            return;
        }
        MediaController mediaController2 = this.cur;
        if (mediaController2 != null && mediaController2.getSessionToken().equals(mediaController.getSessionToken())) {
            read();
            return;
        }
        detach();
        this.cur = mediaController;
        try {
            mediaController.registerCallback(this.ctrlCb, this.h);
        } catch (Throwable unused) {
        }
        read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read() {
        MediaController mediaController = this.cur;
        if (mediaController == null) {
            this.info.any = false;
            emit();
            return;
        }
        try {
            MediaMetadata metadata = mediaController.getMetadata();
            PlaybackState playbackState = mediaController.getPlaybackState();
            Info info = this.info;
            boolean z = true;
            info.any = true;
            info.denied = false;
            info.pkg = mediaController.getPackageName();
            Info info2 = this.info;
            if (playbackState == null || playbackState.getState() != 3) {
                z = false;
            }
            info2.playing = z;
            this.info.pos = viTri(mediaController);
            Bitmap bitmapFirstBitmap = null;
            this.info.title = metadata == null ? null : first(metadata, MediaMetadataCompat.METADATA_KEY_TITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
            this.info.artist = metadata == null ? null : first(metadata, MediaMetadataCompat.METADATA_KEY_ARTIST, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
            Info info3 = this.info;
            if (metadata != null) {
                bitmapFirstBitmap = firstBitmap(metadata, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ART, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON);
            }
            info3.art = bitmapFirstBitmap;
        } catch (Throwable unused) {
            this.info.any = false;
        }
        emit();
    }

    private static float viTri(MediaController mediaController) {
        if (mediaController == null) {
            return -1.0f;
        }
        try {
            PlaybackState playbackState = mediaController.getPlaybackState();
            MediaMetadata metadata = mediaController.getMetadata();
            if (playbackState != null && metadata != null) {
                long j = metadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                if (j <= 0) {
                    return -1.0f;
                }
                return Math.max(0.0f, Math.min(1.0f, playbackState.getPosition() / j));
            }
        } catch (Throwable unused) {
        }
        return -1.0f;
    }

    public Info info() {
        return this.info;
    }

    public void next() {
        MediaController mediaController = this.cur;
        if (mediaController != null) {
            try {
                mediaController.getTransportControls().skipToNext();
            } catch (Throwable unused) {
            }
        }
    }

    public void playPause() {
        MediaController mediaController = this.cur;
        if (mediaController == null) {
            return;
        }
        try {
            if (this.info.playing) {
                mediaController.getTransportControls().pause();
            } else {
                mediaController.getTransportControls().play();
            }
        } catch (Throwable unused) {
        }
    }

    public void prev() {
        MediaController mediaController = this.cur;
        if (mediaController != null) {
            try {
                mediaController.getTransportControls().skipToPrevious();
            } catch (Throwable unused) {
            }
        }
    }

    public void refresh() {
        try {
            MediaSessionManager mediaSessionManager = this.msm;
            if (mediaSessionManager == null) {
                return;
            }
            pick(mediaSessionManager.getActiveSessions(this.listener));
        } catch (SecurityException unused) {
            this.info.denied = true;
            emit();
        } catch (Throwable unused2) {
        }
    }

    public void start(Context context, Cb cb) {
        this.ctx = context.getApplicationContext();
        this.cb = cb;
        this.listener = new ComponentName(this.ctx, (Class<?>) MediaListener.class);
        try {
            MediaSessionManager mediaSessionManager = (MediaSessionManager) this.ctx.getSystemService("media_session");
            this.msm = mediaSessionManager;
            mediaSessionManager.addOnActiveSessionsChangedListener(this.sessionsChanged, this.listener, this.h);
            refresh();
        } catch (SecurityException unused) {
            this.info.denied = true;
            emit();
        } catch (Throwable unused2) {
        }
    }

    public void stop() {
        try {
            MediaSessionManager mediaSessionManager = this.msm;
            if (mediaSessionManager != null) {
                mediaSessionManager.removeOnActiveSessionsChangedListener(this.sessionsChanged);
            }
        } catch (Throwable unused) {
        }
        detach();
    }
}
