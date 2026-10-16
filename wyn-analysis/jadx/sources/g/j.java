package g;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<j> CREATOR = new C2555b(5);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f35475a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f35476b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35477c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35478d;

    public j(IntentSender intentSender, Intent intent, int i5, int i10) {
        AbstractC3340k.e(intentSender, "intentSender");
        this.f35475a = intentSender;
        this.f35476b = intent;
        this.f35477c = i5;
        this.f35478d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i5) {
        AbstractC3340k.e(dest, "dest");
        dest.writeParcelable(this.f35475a, i5);
        dest.writeParcelable(this.f35476b, i5);
        dest.writeInt(this.f35477c);
        dest.writeInt(this.f35478d);
    }
}
