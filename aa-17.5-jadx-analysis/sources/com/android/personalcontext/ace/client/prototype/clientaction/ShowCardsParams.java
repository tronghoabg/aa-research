package com.android.personalcontext.ace.client.prototype.clientaction;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.affa;
import defpackage.eeh;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/android/personalcontext/ace/client/prototype/clientaction/ShowCardsParams;", "Lcom/android/personalcontext/ace/client/prototype/clientaction/ClientActionParams;", "clientSessionId", "", "selectedCardIds", "", "liveDataQueryBundle", "Landroid/os/Bundle;", "liveDataQueryIntent", "Landroid/app/PendingIntent;", "<init>", "(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Landroid/app/PendingIntent;)V", "getClientSessionId", "()Ljava/lang/String;", "getSelectedCardIds", "()Ljava/util/List;", "getLiveDataQueryBundle", "()Landroid/os/Bundle;", "getLiveDataQueryIntent", "()Landroid/app/PendingIntent;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "java.com.google.android.apps.miphone.astrea.ace.java.com.android.personalcontext.ace.client.prototype.clientaction_clientaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShowCardsParams implements ClientActionParams {
    public static final Parcelable.Creator<ShowCardsParams> CREATOR = new eeh(15);
    private final String clientSessionId;
    private final Bundle liveDataQueryBundle;
    private final PendingIntent liveDataQueryIntent;
    private final List<String> selectedCardIds;

    public ShowCardsParams(String str, List<String> list, Bundle bundle, PendingIntent pendingIntent) {
        str.getClass();
        list.getClass();
        this.clientSessionId = str;
        this.selectedCardIds = list;
        this.liveDataQueryBundle = bundle;
        this.liveDataQueryIntent = pendingIntent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShowCardsParams copy$default(ShowCardsParams showCardsParams, String str, List list, Bundle bundle, PendingIntent pendingIntent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = showCardsParams.clientSessionId;
        }
        if ((i & 2) != 0) {
            list = showCardsParams.selectedCardIds;
        }
        if ((i & 4) != 0) {
            bundle = showCardsParams.liveDataQueryBundle;
        }
        if ((i & 8) != 0) {
            pendingIntent = showCardsParams.liveDataQueryIntent;
        }
        return showCardsParams.copy(str, list, bundle, pendingIntent);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientSessionId() {
        return this.clientSessionId;
    }

    public final List<String> component2() {
        return this.selectedCardIds;
    }

    /* renamed from: component3, reason: from getter */
    public final Bundle getLiveDataQueryBundle() {
        return this.liveDataQueryBundle;
    }

    /* renamed from: component4, reason: from getter */
    public final PendingIntent getLiveDataQueryIntent() {
        return this.liveDataQueryIntent;
    }

    public final ShowCardsParams copy(String clientSessionId, List<String> selectedCardIds, Bundle liveDataQueryBundle, PendingIntent liveDataQueryIntent) {
        clientSessionId.getClass();
        selectedCardIds.getClass();
        return new ShowCardsParams(clientSessionId, selectedCardIds, liveDataQueryBundle, liveDataQueryIntent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowCardsParams)) {
            return false;
        }
        ShowCardsParams showCardsParams = (ShowCardsParams) other;
        return affa.f(this.clientSessionId, showCardsParams.clientSessionId) && affa.f(this.selectedCardIds, showCardsParams.selectedCardIds) && affa.f(this.liveDataQueryBundle, showCardsParams.liveDataQueryBundle) && affa.f(this.liveDataQueryIntent, showCardsParams.liveDataQueryIntent);
    }

    public final String getClientSessionId() {
        return this.clientSessionId;
    }

    public final Bundle getLiveDataQueryBundle() {
        return this.liveDataQueryBundle;
    }

    public final PendingIntent getLiveDataQueryIntent() {
        return this.liveDataQueryIntent;
    }

    public final List<String> getSelectedCardIds() {
        return this.selectedCardIds;
    }

    public int hashCode() {
        int iHashCode = (this.clientSessionId.hashCode() * 31) + this.selectedCardIds.hashCode();
        Bundle bundle = this.liveDataQueryBundle;
        int iHashCode2 = ((iHashCode * 31) + (bundle == null ? 0 : bundle.hashCode())) * 31;
        PendingIntent pendingIntent = this.liveDataQueryIntent;
        return iHashCode2 + (pendingIntent != null ? pendingIntent.hashCode() : 0);
    }

    public String toString() {
        return "ShowCardsParams(clientSessionId=" + this.clientSessionId + ", selectedCardIds=" + this.selectedCardIds + ", liveDataQueryBundle=" + this.liveDataQueryBundle + ", liveDataQueryIntent=" + this.liveDataQueryIntent + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.clientSessionId);
        dest.writeStringList(this.selectedCardIds);
        dest.writeBundle(this.liveDataQueryBundle);
        dest.writeParcelable(this.liveDataQueryIntent, flags);
    }
}
