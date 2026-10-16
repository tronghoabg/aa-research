package android.support.v4.media.a;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new t(3);

    /* renamed from: a, reason: collision with root package name */
    final int f436a;

    /* renamed from: b, reason: collision with root package name */
    final long f437b;

    /* renamed from: c, reason: collision with root package name */
    final long f438c;

    /* renamed from: d, reason: collision with root package name */
    final float f439d;

    /* renamed from: e, reason: collision with root package name */
    final long f440e;

    /* renamed from: f, reason: collision with root package name */
    final int f441f;

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f442g;

    /* renamed from: h, reason: collision with root package name */
    final long f443h;

    /* renamed from: i, reason: collision with root package name */
    final List f444i;

    /* renamed from: j, reason: collision with root package name */
    final long f445j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f446k;

    z(Parcel parcel) {
        this.f436a = parcel.readInt();
        this.f437b = parcel.readLong();
        this.f439d = parcel.readFloat();
        this.f443h = parcel.readLong();
        this.f438c = parcel.readLong();
        this.f440e = parcel.readLong();
        this.f442g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f444i = parcel.createTypedArrayList(y.CREATOR);
        this.f445j = parcel.readLong();
        this.f446k = parcel.readBundle(v.class.getClassLoader());
        this.f441f = parcel.readInt();
    }

    public static z e(Object obj) {
        ArrayList arrayList;
        y yVar;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction == null) {
                    yVar = null;
                } else {
                    PlaybackState.CustomAction customAction2 = customAction;
                    Bundle extras = customAction2.getExtras();
                    v.b(extras);
                    yVar = new y(customAction2.getAction(), customAction2.getName(), customAction2.getIcon(), extras);
                }
                arrayList2.add(yVar);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle extras2 = playbackState.getExtras();
        v.b(extras2);
        return new z(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras2);
    }

    public final int a() {
        return this.f436a;
    }

    public final long b() {
        return this.f440e;
    }

    public final long c() {
        return this.f437b;
    }

    public final Bundle d() {
        return this.f446k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List f() {
        return this.f444i;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f436a + ", position=" + this.f437b + ", buffered position=" + this.f438c + ", speed=" + this.f439d + ", updated=" + this.f443h + ", actions=" + this.f440e + ", error code=" + this.f441f + ", error message=" + this.f442g + ", custom actions=" + this.f444i + ", active item id=" + this.f445j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f436a);
        parcel.writeLong(this.f437b);
        parcel.writeFloat(this.f439d);
        parcel.writeLong(this.f443h);
        parcel.writeLong(this.f438c);
        parcel.writeLong(this.f440e);
        TextUtils.writeToParcel(this.f442g, parcel, i2);
        parcel.writeTypedList(this.f444i);
        parcel.writeLong(this.f445j);
        parcel.writeBundle(this.f446k);
        parcel.writeInt(this.f441f);
    }

    z(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List list, long j6, Bundle bundle) {
        this.f436a = i2;
        this.f437b = j2;
        this.f438c = j3;
        this.f439d = f2;
        this.f440e = j4;
        this.f441f = i3;
        this.f442g = charSequence;
        this.f443h = j5;
        this.f444i = new ArrayList(list);
        this.f445j = j6;
        this.f446k = bundle;
    }
}
