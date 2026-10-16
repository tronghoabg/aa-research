package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eep implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public eep(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.a) {
            case 0:
                return new androidx.core.widget.NestedScrollView.SavedState(parcel);
            case 1:
                androidx.core.telecom.extensions.Capability capability = new androidx.core.telecom.extensions.Capability();
                int iDataPosition = parcel.dataPosition();
                int i = parcel.readInt();
                try {
                    if (i < 4) {
                        throw new android.os.BadParcelableException("Parcelable too small");
                    }
                    if (parcel.dataPosition() - iDataPosition < i) {
                        capability.a = parcel.readInt();
                        if (parcel.dataPosition() - iDataPosition < i) {
                            capability.b = parcel.readInt();
                            if (parcel.dataPosition() - iDataPosition < i) {
                                capability.c = parcel.createIntArray();
                            }
                        }
                    }
                    if (iDataPosition <= androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY - i) {
                        parcel.setDataPosition(iDataPosition + i);
                        return capability;
                    }
                    throw new android.os.BadParcelableException("Overflow in the size of parcelable");
                } catch (java.lang.Throwable th) {
                    if (iDataPosition <= androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY - i) {
                        parcel.setDataPosition(iDataPosition + i);
                        throw th;
                    }
                }
            case 2:
                return new androidx.preference.EditTextPreference.SavedState(parcel);
            case 3:
                return new androidx.preference.ListPreference.SavedState(parcel);
            case 4:
                return new androidx.preference.MultiSelectListPreference.SavedState(parcel);
            case 5:
                return new androidx.preference.Preference.BaseSavedState(parcel);
            case 6:
                return new androidx.preference.PreferenceGroup.SavedState(parcel);
            case 7:
                return new androidx.preference.SeekBarPreference.SavedState(parcel);
            case 8:
                return new androidx.preference.TwoStatePreference.SavedState(parcel);
            case 9:
                return new androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState(parcel);
            case 10:
                return new androidx.versionedparcelable.ParcelImpl(parcel);
            case 11:
                parcel.getClass();
                java.lang.String string = parcel.readString();
                int i2 = parcel.readInt();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new coil.memory.MemoryCache$Key(string, linkedHashMap);
            case 12:
                parcel.getClass();
                parcel.readInt();
                return new com.android.personalcontext.ace.client.prototype.clientaction.FullScreenRequestParams();
            case 13:
                parcel.getClass();
                parcel.readInt();
                return new com.android.personalcontext.ace.client.prototype.clientaction.ShareLiveLocationParams();
            case 14:
                parcel.getClass();
                return new com.android.personalcontext.ace.client.prototype.clientaction.SharePhotoParams(parcel.readString());
            case 15:
                parcel.getClass();
                return new com.android.personalcontext.ace.client.prototype.clientaction.ShowCardsParams(parcel.readString(), parcel.createStringArrayList(), parcel.readBundle(com.android.personalcontext.ace.client.prototype.clientaction.ShowCardsParams.class.getClassLoader()), (android.app.PendingIntent) parcel.readParcelable(com.android.personalcontext.ace.client.prototype.clientaction.ShowCardsParams.class.getClassLoader()));
            case 16:
                parcel.getClass();
                return new com.android.personalcontext.ace.client.prototype.clientaction.TextPasteParams(parcel.readString());
            case 17:
                parcel.getClass();
                parcel.readInt();
                return new com.android.personalcontext.ace.client.prototype.clientaction.UnknownParams();
            case 18:
                parcel.getClass();
                return new com.android.personalcontext.ace.client.prototype.richcard.RichCardError(parcel.readString(), parcel.readString());
            case 19:
                java.lang.String string2 = parcel.readString();
                string2.getClass();
                return new com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber(string2, parcel.readString(), parcel.readString(), parcel.readByte() == 1);
            default:
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                java.lang.String string3 = parcel.readString();
                long j3 = parcel.readLong();
                long j4 = parcel.readLong();
                int i4 = parcel.readInt();
                new com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarEvent(j, j2, string3, j3, j4, i4 == 1, parcel.readString(), parcel.readInt(), defpackage.ygw.o(parcel.readArrayList(com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber.class.getClassLoader())), parcel.readInt() == 1);
                return r0;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new androidx.core.widget.NestedScrollView.SavedState[i];
            case 1:
                return new androidx.core.telecom.extensions.Capability[i];
            case 2:
                return new androidx.preference.EditTextPreference.SavedState[i];
            case 3:
                return new androidx.preference.ListPreference.SavedState[i];
            case 4:
                return new androidx.preference.MultiSelectListPreference.SavedState[i];
            case 5:
                return new androidx.preference.Preference.BaseSavedState[i];
            case 6:
                return new androidx.preference.PreferenceGroup.SavedState[i];
            case 7:
                return new androidx.preference.SeekBarPreference.SavedState[i];
            case 8:
                return new androidx.preference.TwoStatePreference.SavedState[i];
            case 9:
                return new androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState[i];
            case 10:
                return new androidx.versionedparcelable.ParcelImpl[i];
            case 11:
                return new coil.memory.MemoryCache$Key[i];
            case 12:
                return new com.android.personalcontext.ace.client.prototype.clientaction.FullScreenRequestParams[i];
            case 13:
                return new com.android.personalcontext.ace.client.prototype.clientaction.ShareLiveLocationParams[i];
            case 14:
                return new com.android.personalcontext.ace.client.prototype.clientaction.SharePhotoParams[i];
            case 15:
                return new com.android.personalcontext.ace.client.prototype.clientaction.ShowCardsParams[i];
            case 16:
                return new com.android.personalcontext.ace.client.prototype.clientaction.TextPasteParams[i];
            case 17:
                return new com.android.personalcontext.ace.client.prototype.clientaction.UnknownParams[i];
            case 18:
                return new com.android.personalcontext.ace.client.prototype.richcard.RichCardError[i];
            case 19:
                return new com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber[i];
            default:
                return new com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarEvent[i];
        }
    }
}
