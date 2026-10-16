package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import defpackage.df;
import defpackage.di;
import defpackage.dq;
import defpackage.dr;
import defpackage.du;
import defpackage.dv;
import defpackage.dx;
import defpackage.dy;
import defpackage.dz;
import defpackage.fhx;
import defpackage.x;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class MediaSessionCompat {
    public final dq a;
    public final dv b;
    private final ArrayList c = new ArrayList();

    /* loaded from: classes2.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new x(9);
        final ResultReceiver a;

        public ResultReceiverWrapper(Parcel parcel) {
            this.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new x(10);
        public final Object b;
        public di c;
        public final Object a = new Object();
        public fhx d = null;

        public Token(Object obj, di diVar) {
            this.b = obj;
            this.c = diVar;
        }

        public static Token b(Object obj, di diVar) {
            if (obj != null) {
                return new Token(obj, diVar);
            }
            return null;
        }

        public final di a() {
            di diVar;
            synchronized (this.a) {
                diVar = this.c;
            }
            return diVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.b;
            if (obj2 == null) {
                return token.b == null;
            }
            Object obj3 = token.b;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object] */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    public MediaSessionCompat(Context context, String str) {
        ComponentName componentName;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        PendingIntent broadcast = null;
        if (listQueryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = listQueryBroadcastReceivers.get(0);
            componentName = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        } else {
            if (listQueryBroadcastReceivers.size() > 1) {
                Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = null;
        }
        if (componentName == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            broadcast = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new dy(context, str);
        } else {
            this.b = new dx(context, str);
        }
        f(new dr(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.b.a.setMediaButtonReceiver(broadcast);
        this.a = new dq(context, b());
    }

    public static Bundle a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        c(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void c(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public final Token b() {
        return this.b.b;
    }

    public final void d() {
        dv dvVar = this.b;
        dvVar.d.kill();
        MediaSession mediaSession = dvVar.a;
        mediaSession.setCallback(null);
        dvVar.h.a.set(null);
        mediaSession.release();
    }

    public final void e(boolean z) {
        this.b.a.setActive(z);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dz) arrayList.get(i)).a();
        }
    }

    public final void f(du duVar, Handler handler) {
        dv dvVar = this.b;
        if (duVar == null) {
            dvVar.b(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        dvVar.b(duVar, handler);
    }

    public final void g(Bundle bundle) {
        this.b.a.setExtras(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(MediaMetadataCompat mediaMetadataCompat) {
        dv dvVar = this.b;
        dvVar.f = mediaMetadataCompat;
        if (mediaMetadataCompat.c == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            Bundle bundle = mediaMetadataCompat.b;
            for (String str : bundle.keySet()) {
                Integer num = (Integer) MediaMetadataCompat.a.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str, 0L));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Bitmap) {
                        builder.putBitmap(str, (Bitmap) obj);
                    } else if (obj instanceof Rating) {
                        builder.putRating(str, (Rating) obj);
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            mediaMetadataCompat.c = builder.build();
        }
        dvVar.a.setMetadata(mediaMetadataCompat.c);
    }

    public final void i(PlaybackStateCompat playbackStateCompat) {
        PlaybackState playbackState;
        dv dvVar = this.b;
        dvVar.e = playbackStateCompat;
        synchronized (dvVar.c) {
            RemoteCallbackList remoteCallbackList = dvVar.d;
            int iBeginBroadcast = remoteCallbackList.beginBroadcast();
            while (true) {
                iBeginBroadcast--;
                if (iBeginBroadcast < 0) {
                    break;
                } else {
                    try {
                        ((df) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).a(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
            }
            dvVar.d.finishBroadcast();
        }
        MediaSession mediaSession = dvVar.a;
        if (playbackStateCompat == null) {
            playbackState = null;
        } else {
            if (playbackStateCompat.l == null) {
                PlaybackState.Builder builder = new PlaybackState.Builder();
                builder.setState(playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.h);
                builder.setBufferedPosition(playbackStateCompat.c);
                builder.setActions(playbackStateCompat.e);
                builder.setErrorMessage(playbackStateCompat.g);
                for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.i) {
                    PlaybackState.CustomAction customActionBuild = customAction.e;
                    if (customActionBuild == null) {
                        PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(customAction.a, customAction.b, customAction.c);
                        builder2.setExtras(customAction.d);
                        customActionBuild = builder2.build();
                    }
                    builder.addCustomAction(customActionBuild);
                }
                builder.setActiveQueueItemId(playbackStateCompat.j);
                builder.setExtras(playbackStateCompat.k);
                playbackStateCompat.l = builder.build();
            }
            playbackState = playbackStateCompat.l;
        }
        mediaSession.setPlaybackState(playbackState);
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new x(8);
        public final MediaDescriptionCompat a;
        public final long b;

        private QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.a = mediaDescriptionCompat;
            this.b = j;
        }

        public static List a(List list) {
            QueueItem queueItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj == null) {
                    queueItem = null;
                } else {
                    MediaSession.QueueItem queueItem2 = (MediaSession.QueueItem) obj;
                    queueItem = new QueueItem(MediaDescriptionCompat.a(queueItem2.getDescription()), queueItem2.getQueueId());
                }
                arrayList.add(queueItem);
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
            parcel.writeLong(this.b);
        }

        public QueueItem(Parcel parcel) {
            this.a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.b = parcel.readLong();
        }
    }
}
