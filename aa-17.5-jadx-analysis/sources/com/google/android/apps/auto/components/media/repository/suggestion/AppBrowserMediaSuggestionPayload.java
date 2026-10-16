package com.google.android.apps.auto.components.media.repository.suggestion;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.khy;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class AppBrowserMediaSuggestionPayload implements MediaSuggestionPlaybackPayload {
    public static final Parcelable.Creator<AppBrowserMediaSuggestionPayload> CREATOR = new khy(5);
    public final String a;
    public final ComponentName b;

    public AppBrowserMediaSuggestionPayload(ComponentName componentName, String str) {
        this.b = componentName;
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AppBrowserMediaSuggestionPayload)) {
            return false;
        }
        AppBrowserMediaSuggestionPayload appBrowserMediaSuggestionPayload = (AppBrowserMediaSuggestionPayload) obj;
        return Objects.equals(this.a, appBrowserMediaSuggestionPayload.a) && Objects.equals(this.b, appBrowserMediaSuggestionPayload.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.a);
    }
}
