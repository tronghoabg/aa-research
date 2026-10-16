package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kid implements android.os.Parcelable.Creator {
    private final /* synthetic */ int a;

    public kid(int i) {
        this.a = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: spq */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) throws spq {
        boolean z;
        long j;
        com.google.android.gms.auth.aang.GoogleAccount googleAccount = null;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new com.google.android.apps.auto.components.calendar.model.CrossProfileCalendarStore_Bundler();
            case 1:
                long j2 = parcel.readLong();
                long j3 = parcel.readLong();
                long j4 = parcel.readLong();
                java.lang.String string = parcel.readString();
                long j5 = parcel.readLong();
                long j6 = parcel.readLong();
                long j7 = parcel.readLong();
                java.lang.String string2 = parcel.readString();
                defpackage.ygw ygwVarO = defpackage.ygw.o(parcel.readArrayList(com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber.class.getClassLoader()));
                if (parcel.readInt() == 1) {
                    z = true;
                    j = j3;
                } else {
                    z = false;
                    j = j3;
                }
                new com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarReminder(j2, j, j4, string, j5, j6, j7, string2, ygwVarO, z);
                return r0;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new com.google.android.apps.auto.components.car.info.StartingProcessInfo(parcel);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new com.google.android.apps.auto.components.connectivity.models.CarInfoWrapper.Core(parcel);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction(parcel);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.content.ComponentName componentName = (android.content.ComponentName) parcel.readParcelable(android.content.ComponentName.class.getClassLoader());
                java.lang.String string3 = parcel.readString();
                string3.getClass();
                return new com.google.android.apps.auto.components.media.repository.suggestion.AppBrowserMediaSuggestionPayload(componentName, string3);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                osv osvVar = osv.a;
                try {
                    osvVar = (osv) defpackage.acmh.B(parcel, osvVar, defpackage.abol.a());
                } catch (defpackage.abpp e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.media.repository.suggestion.AssistantMediaSuggestionPlaybackPayload.a.g()).p(e)).ai((char) 4174)).u("Failed to read from parcel");
                }
                return new com.google.android.apps.auto.components.media.repository.suggestion.AssistantMediaSuggestionPlaybackPayload(osvVar);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                parcel.getClass();
                return new com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher.SavedState(parcel.readParcelable(com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher.SavedState.class.getClassLoader()), parcel.readInt());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.apps.auto.components.system.transcription.TranscriptionFragment.PendingTranscriptionState(parcel);
            case 9:
                int i = parcel.readInt();
                defpackage.oeg oegVarA = defpackage.oeg.a(parcel.readInt());
                java.lang.String string4 = parcel.readString();
                string4.getClass();
                java.lang.String string5 = parcel.readString();
                string5.getClass();
                java.lang.String string6 = parcel.readString();
                string6.getClass();
                return new com.google.android.apps.auto.components.telecom.PhoneCall(i, oegVarA, string4, string5, string6, (android.graphics.Bitmap) parcel.readParcelable(android.graphics.Bitmap.class.getClassLoader()), parcel.readInt(), (android.content.ComponentName) parcel.readParcelable(android.content.ComponentName.class.getClassLoader()), parcel.readString());
            case 10:
                int iT = defpackage.sqs.T(parcel);
                com.google.android.apps.auto.components.telecom.call.CarCall carCall = null;
                java.util.ArrayList arrayListAe = null;
                java.lang.String strAb = null;
                com.google.android.apps.auto.components.telecom.call.CarCall.Details details = null;
                int iR = 0;
                int iR2 = 0;
                boolean zAj = false;
                while (parcel.dataPosition() < iT) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            iR = defpackage.sqs.R(parcel, i2);
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) defpackage.sqs.X(parcel, i2, com.google.android.apps.auto.components.telecom.call.CarCall.CREATOR);
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            arrayListAe = defpackage.sqs.ae(parcel, i2);
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            strAb = defpackage.sqs.ab(parcel, i2);
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            iR2 = defpackage.sqs.R(parcel, i2);
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            details = (com.google.android.apps.auto.components.telecom.call.CarCall.Details) defpackage.sqs.X(parcel, i2, com.google.android.apps.auto.components.telecom.call.CarCall.Details.CREATOR);
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            zAj = defpackage.sqs.aj(parcel, i2);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i2);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT);
                return new com.google.android.apps.auto.components.telecom.call.CarCall(iR, carCall, arrayListAe, strAb, iR2, details, zAj);
            case 11:
                int iT2 = defpackage.sqs.T(parcel);
                long jU = 0;
                android.net.Uri uri = null;
                java.lang.String strAb2 = null;
                android.telecom.DisconnectCause disconnectCause = null;
                android.net.Uri uri2 = null;
                android.net.Uri uri3 = null;
                android.telecom.PhoneAccountHandle phoneAccountHandle = null;
                android.os.Bundle bundleV = null;
                android.os.Bundle bundleV2 = null;
                android.telecom.GatewayInfo gatewayInfo = null;
                int iR3 = 0;
                int iR4 = 0;
                int iR5 = 0;
                while (parcel.dataPosition() < iT2) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            uri = (android.net.Uri) defpackage.sqs.X(parcel, i3, android.net.Uri.CREATOR);
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            strAb2 = defpackage.sqs.ab(parcel, i3);
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            disconnectCause = (android.telecom.DisconnectCause) defpackage.sqs.X(parcel, i3, android.telecom.DisconnectCause.CREATOR);
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            jU = defpackage.sqs.U(parcel, i3);
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            uri2 = (android.net.Uri) defpackage.sqs.X(parcel, i3, android.net.Uri.CREATOR);
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri3 = (android.net.Uri) defpackage.sqs.X(parcel, i3, android.net.Uri.CREATOR);
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            iR3 = defpackage.sqs.R(parcel, i3);
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            phoneAccountHandle = (android.telecom.PhoneAccountHandle) defpackage.sqs.X(parcel, i3, android.telecom.PhoneAccountHandle.CREATOR);
                            break;
                        case '\t':
                            iR4 = defpackage.sqs.R(parcel, i3);
                            break;
                        case '\n':
                            bundleV = defpackage.sqs.V(parcel, i3);
                            break;
                        case 11:
                            bundleV2 = defpackage.sqs.V(parcel, i3);
                            break;
                        case '\f':
                            iR5 = defpackage.sqs.R(parcel, i3);
                            break;
                        case '\r':
                            gatewayInfo = (android.telecom.GatewayInfo) defpackage.sqs.X(parcel, i3, android.telecom.GatewayInfo.CREATOR);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i3);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT2);
                return new com.google.android.apps.auto.components.telecom.call.CarCall.Details(uri, strAb2, disconnectCause, jU, uri2, uri3, iR3, phoneAccountHandle, iR4, bundleV, bundleV2, iR5, gatewayInfo);
            case 12:
                return new com.google.android.apps.auto.sdk.ui.FloatingActionButton.SavedState(parcel);
            case 13:
                return new com.google.android.enterprise.connectedapps.internal.BundlerType(parcel);
            case 14:
                return new com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList(parcel);
            case 15:
                return new com.google.android.flexbox.FlexboxLayout.LayoutParams(parcel);
            case 16:
                return new com.google.android.flexbox.FlexboxLayoutManager.LayoutParams(parcel);
            case 17:
                return new com.google.android.flexbox.FlexboxLayoutManager.SavedState(parcel);
            case 18:
                int iT3 = defpackage.sqs.T(parcel);
                java.lang.String strAb3 = null;
                java.lang.Long lAa = null;
                java.util.ArrayList arrayListAe2 = null;
                java.lang.String strAb4 = null;
                int iR6 = 0;
                boolean zAj2 = false;
                boolean zAj3 = false;
                while (parcel.dataPosition() < iT3) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            iR6 = defpackage.sqs.R(parcel, i4);
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            strAb3 = defpackage.sqs.ab(parcel, i4);
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            lAa = defpackage.sqs.aa(parcel, i4);
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            zAj2 = defpackage.sqs.aj(parcel, i4);
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            zAj3 = defpackage.sqs.aj(parcel, i4);
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            arrayListAe2 = defpackage.sqs.ae(parcel, i4);
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            strAb4 = defpackage.sqs.ab(parcel, i4);
                            break;
                        default:
                            defpackage.sqs.ai(parcel, i4);
                            break;
                    }
                }
                defpackage.sqs.ag(parcel, iT3);
                return new com.google.android.gms.auth.TokenData(iR6, strAb3, lAa, zAj2, zAj3, arrayListAe2, strAb4);
            case 19:
                int iT4 = defpackage.sqs.T(parcel);
                boolean zAj4 = false;
                boolean zAj5 = false;
                while (parcel.dataPosition() < iT4) {
                    int i5 = parcel.readInt();
                    char c = (char) i5;
                    if (c == 1) {
                        zAj5 = defpackage.sqs.aj(parcel, i5);
                    } else if (c != 2) {
                        defpackage.sqs.ai(parcel, i5);
                    } else {
                        zAj4 = defpackage.sqs.aj(parcel, i5);
                    }
                }
                defpackage.sqs.ag(parcel, iT4);
                return new com.google.android.gms.auth.aang.AppRestrictionState(zAj5, zAj4);
            default:
                int iT5 = defpackage.sqs.T(parcel);
                com.google.android.gms.auth.aang.AppRestrictionState appRestrictionState = null;
                while (parcel.dataPosition() < iT5) {
                    int i6 = parcel.readInt();
                    char c2 = (char) i6;
                    if (c2 == 1) {
                        googleAccount = (com.google.android.gms.auth.aang.GoogleAccount) defpackage.sqs.X(parcel, i6, com.google.android.gms.auth.aang.GoogleAccount.CREATOR);
                    } else if (c2 != 2) {
                        defpackage.sqs.ai(parcel, i6);
                    } else {
                        appRestrictionState = (com.google.android.gms.auth.aang.AppRestrictionState) defpackage.sqs.X(parcel, i6, com.google.android.gms.auth.aang.AppRestrictionState.CREATOR);
                    }
                }
                defpackage.sqs.ag(parcel, iT5);
                return new com.google.android.gms.auth.aang.AccountWithAppRestrictionState(googleAccount, appRestrictionState);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new com.google.android.apps.auto.components.calendar.model.CrossProfileCalendarStore_Bundler[i];
            case 1:
                return new com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarReminder[i];
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new com.google.android.apps.auto.components.car.info.StartingProcessInfo[i];
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new com.google.android.apps.auto.components.connectivity.models.CarInfoWrapper.Core[i];
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new com.google.android.apps.auto.components.media.compat.AaPlaybackState.AaCustomAction[i];
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new com.google.android.apps.auto.components.media.repository.suggestion.AppBrowserMediaSuggestionPayload[i];
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.google.android.apps.auto.components.media.repository.suggestion.AssistantMediaSuggestionPlaybackPayload[i];
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher.SavedState[i];
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new com.google.android.apps.auto.components.system.transcription.TranscriptionFragment.PendingTranscriptionState[i];
            case 9:
                return new com.google.android.apps.auto.components.telecom.PhoneCall[i];
            case 10:
                return new com.google.android.apps.auto.components.telecom.call.CarCall[i];
            case 11:
                return new com.google.android.apps.auto.components.telecom.call.CarCall.Details[i];
            case 12:
                return new com.google.android.apps.auto.sdk.ui.FloatingActionButton.SavedState[i];
            case 13:
                return new com.google.android.enterprise.connectedapps.internal.BundlerType[i];
            case 14:
                return new com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList[i];
            case 15:
                return new com.google.android.flexbox.FlexboxLayout.LayoutParams[i];
            case 16:
                return new com.google.android.flexbox.FlexboxLayoutManager.LayoutParams[i];
            case 17:
                return new com.google.android.flexbox.FlexboxLayoutManager.SavedState[i];
            case 18:
                return new com.google.android.gms.auth.TokenData[i];
            case 19:
                return new com.google.android.gms.auth.aang.AppRestrictionState[i];
            default:
                return new com.google.android.gms.auth.aang.AccountWithAppRestrictionState[i];
        }
    }
}
