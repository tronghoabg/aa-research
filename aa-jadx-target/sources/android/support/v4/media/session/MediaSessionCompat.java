package android.support.v4.media.session;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class MediaSessionCompat {
    public final dq a;
    public final dv b;
    private final java.util.ArrayList c = new java.util.ArrayList();

    public MediaSessionCompat(android.content.Context context, java.lang.String str) {
        android.content.ComponentName componentName;
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("tag must not be null or empty");
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        android.app.PendingIntent broadcast = null;
        if (listQueryBroadcastReceivers.size() == 1) {
            android.content.pm.ResolveInfo resolveInfo = listQueryBroadcastReceivers.get(0);
            componentName = new android.content.ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        } else {
            if (listQueryBroadcastReceivers.size() > 1) {
                android.util.Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = null;
        }
        if (componentName == null) {
            android.util.Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null) {
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            broadcast = android.app.PendingIntent.getBroadcast(context, 0, intent2, android.os.Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.b = new dy(context, str);
        } else {
            this.b = new dx(context, str);
        }
        f(new dr(), new android.os.Handler(android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper()));
        this.b.a.setMediaButtonReceiver(broadcast);
        this.a = new dq(context, b());
    }

    public static android.os.Bundle a(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        c(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (android.os.BadParcelableException unused) {
            android.util.Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void c(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(android.support.v4.media.session.MediaSessionCompat.class.getClassLoader());
        }
    }

    public final android.support.v4.media.session.MediaSessionCompat.Token b() {
        return this.b.b;
    }

    public final void d() {
        dv dvVar = this.b;
        dvVar.d.kill();
        android.media.session.MediaSession mediaSession = dvVar.a;
        mediaSession.setCallback(null);
        dvVar.h.a.set(null);
        mediaSession.release();
    }

    public final void e(boolean z) {
        this.b.a.setActive(z);
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dz) arrayList.get(i)).a();
        }
    }

    public final void f(du duVar, android.os.Handler handler) {
        dv dvVar = this.b;
        if (duVar == null) {
            dvVar.b((du) null, (android.os.Handler) null);
            return;
        }
        if (handler == null) {
            handler = new android.os.Handler();
        }
        dvVar.b(duVar, handler);
    }

    public final void g(android.os.Bundle bundle) {
        this.b.a.setExtras(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(android.support.v4.media.MediaMetadataCompat mediaMetadataCompat) {
        dv dvVar = this.b;
        dvVar.f = mediaMetadataCompat;
        if (mediaMetadataCompat.c == null) {
            android.media.MediaMetadata.Builder builder = new android.media.MediaMetadata.Builder();
            android.os.Bundle bundle = mediaMetadataCompat.b;
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Integer num = (java.lang.Integer) android.support.v4.media.MediaMetadataCompat.a.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str, 0L));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (android.graphics.Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    java.lang.Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof java.lang.CharSequence)) {
                        builder.putText(str, (java.lang.CharSequence) obj);
                    } else if (obj instanceof java.lang.Long) {
                        builder.putLong(str, ((java.lang.Long) obj).longValue());
                    } else if (obj instanceof android.graphics.Bitmap) {
                        builder.putBitmap(str, (android.graphics.Bitmap) obj);
                    } else if (obj instanceof android.media.Rating) {
                        builder.putRating(str, (android.media.Rating) obj);
                    }
                } else {
                    builder.putRating(str, (android.media.Rating) bundle.getParcelable(str));
                }
            }
            mediaMetadataCompat.c = builder.build();
        }
        dvVar.a.setMetadata(mediaMetadataCompat.c);
    }

    public final void i(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        android.media.session.PlaybackState playbackState;
        dv dvVar = this.b;
        dvVar.e = playbackStateCompat;
        synchronized (dvVar.c) {
            android.os.RemoteCallbackList remoteCallbackList = dvVar.d;
            int iBeginBroadcast = remoteCallbackList.beginBroadcast();
            while (true) {
                iBeginBroadcast--;
                if (iBeginBroadcast < 0) {
                    break;
                } else {
                    try {
                        remoteCallbackList.getBroadcastItem(iBeginBroadcast).a(playbackStateCompat);
                    } catch (android.os.RemoteException unused) {
                    }
                }
            }
            dvVar.d.finishBroadcast();
        }
        android.media.session.MediaSession mediaSession = dvVar.a;
        if (playbackStateCompat == null) {
            playbackState = null;
        } else {
            if (playbackStateCompat.l == null) {
                android.media.session.PlaybackState.Builder builder = new android.media.session.PlaybackState.Builder();
                builder.setState(playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.h);
                builder.setBufferedPosition(playbackStateCompat.c);
                builder.setActions(playbackStateCompat.e);
                builder.setErrorMessage(playbackStateCompat.g);
                for (android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction : playbackStateCompat.i) {
                    android.media.session.PlaybackState.CustomAction customActionBuild = customAction.e;
                    if (customActionBuild == null) {
                        android.media.session.PlaybackState.CustomAction.Builder builder2 = new android.media.session.PlaybackState.CustomAction.Builder(customAction.a, customAction.b, customAction.c);
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
}
