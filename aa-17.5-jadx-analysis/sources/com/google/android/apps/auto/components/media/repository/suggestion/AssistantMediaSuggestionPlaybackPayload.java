package com.google.android.apps.auto.components.media.repository.suggestion;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.khy;
import defpackage.ory;
import defpackage.wox;
import defpackage.yph;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class AssistantMediaSuggestionPlaybackPayload implements MediaSuggestionPlaybackPayload {
    public final ory b;
    public static final yph a = yph.c("GH.AssistMediaSug");
    public static final Parcelable.Creator<AssistantMediaSuggestionPlaybackPayload> CREATOR = new khy(6);

    public AssistantMediaSuggestionPlaybackPayload(ory oryVar) {
        this.b = oryVar;
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AssistantMediaSuggestionPlaybackPayload) {
            return Objects.equals(this.b, ((AssistantMediaSuggestionPlaybackPayload) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        wox.am(parcel, this.b);
    }
}
