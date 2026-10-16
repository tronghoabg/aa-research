package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class dt extends MediaSession.Callback {
    final /* synthetic */ du a;

    public dt(du duVar) {
        this.a = duVar;
    }

    private final dv a() {
        dv dvVar;
        du duVar = this.a;
        synchronized (duVar.a) {
            dvVar = (dv) duVar.c.get();
        }
        if (dvVar == null || this.a != dvVar.a()) {
            return null;
        }
        return dvVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        fhx fhxVar;
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        MediaSessionCompat.c(bundle);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat.Token token = dvVarA.b;
                di diVarA = token.a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", diVarA == null ? null : diVarA.asBinder());
                synchronized (token.a) {
                    fhxVar = token.d;
                }
                if (fhxVar == null) {
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", null);
                } else {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(fhxVar));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            } else {
                str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        MediaSessionCompat.c(bundle);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                MediaSessionCompat.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                this.a.h();
            } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    MediaSessionCompat.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    MediaSessionCompat.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    MediaSessionCompat.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    MediaSessionCompat.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                } else {
                    this.a.f(str);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        dv dvVarA = a();
        if (dvVarA == null) {
            return false;
        }
        dvVarA.d();
        return super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        this.a.a();
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        this.a.b();
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        MediaSessionCompat.c(bundle);
        this.a.g(str);
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        MediaSessionCompat.c(bundle);
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        MediaSessionCompat.c(bundle);
        this.a.h();
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        MediaSessionCompat.c(bundle);
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        MediaSessionCompat.c(bundle);
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        MediaSessionCompat.c(bundle);
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f;
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        if (rating != null) {
            int ratingStyle = rating.getRatingStyle();
            RatingCompat ratingCompat = null;
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(ratingStyle, -1.0f);
                        break;
                }
            } else {
                float f2 = BitmapDescriptorFactory.HUE_RED;
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = RatingCompat.a(rating.hasHeart());
                        break;
                    case 2:
                        if (true == rating.isThumbUp()) {
                            f2 = 1.0f;
                        }
                        ratingCompat = new RatingCompat(2, f2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float starRating = rating.getStarRating();
                        if (ratingStyle == 3) {
                            f = 3.0f;
                        } else if (ratingStyle == 4) {
                            f = 4.0f;
                        } else if (ratingStyle != 5) {
                            Log.e("Rating", a.bn(ratingStyle, "Invalid rating style (", ") for a star rating"));
                            break;
                        } else {
                            f = 5.0f;
                        }
                        if (starRating >= BitmapDescriptorFactory.HUE_RED && starRating <= f) {
                            ratingCompat = new RatingCompat(ratingStyle, starRating);
                            break;
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        }
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= BitmapDescriptorFactory.HUE_RED && percentRating <= 100.0f) {
                            ratingCompat = new RatingCompat(6, percentRating);
                            break;
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        }
                }
            }
            ratingCompat.c = rating;
        }
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        this.a.c();
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        this.a.d();
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        dvVarA.d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        dv dvVarA = a();
        if (dvVarA == null) {
            return;
        }
        this.a.e();
        dvVarA.d();
    }
}
