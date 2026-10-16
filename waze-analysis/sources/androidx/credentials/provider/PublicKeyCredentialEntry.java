package androidx.credentials.provider;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.credentials.CredentialOption;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.provider.BeginGetPublicKeyCredentialOption;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import com.waze.R;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import j$.time.Instant;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PublicKeyCredentialEntry extends CredentialEntry {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "PublicKeyCredEntry";
    private final CharSequence displayName;
    private final Icon icon;
    private final boolean isAutoSelectAllowed;
    private final boolean isAutoSelectAllowedFromOption;
    private final boolean isCreatedFromSlice;
    private final boolean isDefaultIconFromSlice;
    private final Instant lastUsedTime;
    private final PendingIntent pendingIntent;
    private final CharSequence typeDisplayName;
    private final CharSequence username;

    /* compiled from: WazeSource */
    final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        public static final PublicKeyCredentialEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            List<SliceItem> items = slice.getItems();
            x.e(items, "getItems(...)");
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            CharSequence text = null;
            CharSequence text2 = null;
            CharSequence text3 = null;
            CharSequence text4 = null;
            PendingIntent action = null;
            Icon icon = null;
            Instant instantOfEpochMilli = null;
            CharSequence text5 = null;
            CharSequence text6 = null;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_OPTION_ID)) {
                    text = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)) {
                    text5 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)) {
                    if (x.n(sliceItem.getText(), CredentialEntry.TRUE_STRING)) {
                        z2 = true;
                    }
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN)) {
                    text6 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)) {
                    text4 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_TITLE)) {
                    text2 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_SUBTITLE)) {
                    text3 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_ICON)) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_PENDING_INTENT)) {
                    action = sliceItem.getAction();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS)) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AUTO_ALLOWED)) {
                    if (x.n(sliceItem.getText(), CredentialEntry.TRUE_STRING)) {
                        z = true;
                    }
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION)) {
                    z3 = true;
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID)) {
                    z4 = true;
                }
            }
            try {
                x.c(text2);
                x.c(text4);
                x.c(action);
                x.c(icon);
                BeginGetPublicKeyCredentialOption.Companion companion = BeginGetPublicKeyCredentialOption.Companion;
                Bundle bundle = new Bundle();
                x.c(text);
                return new PublicKeyCredentialEntry(text2, text3, text4, action, icon, instantOfEpochMilli, z, companion.createFromEntrySlice$credentials(bundle, text.toString()), z2, text5, text6, null, z3, true, z4, 2048, null);
            } catch (Exception e2) {
                Log.i(PublicKeyCredentialEntry.TAG, "fromSlice failed with: ".concat(String.valueOf(e2.getMessage())));
                return null;
            }
        }

        public static final boolean isDefaultIcon(PublicKeyCredentialEntry publicKeyCredentialEntry) {
            x.f(publicKeyCredentialEntry, "entry");
            return publicKeyCredentialEntry.isCreatedFromSlice ? publicKeyCredentialEntry.isDefaultIconFromSlice : publicKeyCredentialEntry.getIcon().getType() == 2 && publicKeyCredentialEntry.getIcon().getResId() == R.drawable.adx_ic_passkey;
        }

        public static final Slice toSlice(PublicKeyCredentialEntry publicKeyCredentialEntry) {
            x.f(publicKeyCredentialEntry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(publicKeyCredentialEntry.getType(), 1));
            INSTANCE.addToSlice(publicKeyCredentialEntry, builder);
            Slice sliceBuild = builder.build();
            x.e(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final void addToSlice(PublicKeyCredentialEntry publicKeyCredentialEntry, Slice.Builder builder) {
            x.f(publicKeyCredentialEntry, "entry");
            x.f(builder, "sliceBuilder");
            BeginGetCredentialOption beginGetCredentialOption = publicKeyCredentialEntry.getBeginGetCredentialOption();
            CharSequence entryGroupId = publicKeyCredentialEntry.getEntryGroupId();
            boolean zIsDefaultIconPreferredAsSingleProvider = publicKeyCredentialEntry.isDefaultIconPreferredAsSingleProvider();
            String str = CredentialEntry.FALSE_STRING;
            builder.addText(beginGetCredentialOption.getId(), null, i.d(CredentialEntry.SLICE_HINT_OPTION_ID)).addText(entryGroupId, null, i.d(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)).addText(true != zIsDefaultIconPreferredAsSingleProvider ? CredentialEntry.FALSE_STRING : CredentialEntry.TRUE_STRING, null, i.d(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)).addText(publicKeyCredentialEntry.getAffiliatedDomain(), null, i.d(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN));
            CharSequence username = publicKeyCredentialEntry.getUsername();
            CharSequence displayName = publicKeyCredentialEntry.getDisplayName();
            PendingIntent pendingIntent = publicKeyCredentialEntry.getPendingIntent();
            CharSequence typeDisplayName = publicKeyCredentialEntry.getTypeDisplayName();
            Instant lastUsedTime = publicKeyCredentialEntry.getLastUsedTime();
            Icon icon = publicKeyCredentialEntry.getIcon();
            if (true == publicKeyCredentialEntry.isAutoSelectAllowed()) {
                str = CredentialEntry.TRUE_STRING;
            }
            builder.addText(typeDisplayName, null, i.d(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)).addText(username, null, i.d(CredentialEntry.SLICE_HINT_TITLE)).addText(displayName, null, i.d(CredentialEntry.SLICE_HINT_SUBTITLE)).addText(str, null, i.d(CredentialEntry.SLICE_HINT_AUTO_ALLOWED)).addIcon(icon, null, i.d(CredentialEntry.SLICE_HINT_ICON));
            try {
                if (publicKeyCredentialEntry.hasDefaultIcon()) {
                    builder.addInt(1, null, i.d(CredentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID));
                }
            } catch (IllegalStateException unused) {
            }
            if (publicKeyCredentialEntry.isAutoSelectAllowedFromOption()) {
                builder.addInt(1, null, i.d(CredentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION));
            }
            if (lastUsedTime != null) {
                builder.addLong(lastUsedTime.toEpochMilli(), null, i.d(CredentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS));
            }
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(CredentialEntry.SLICE_HINT_PENDING_INTENT)).build(), null);
        }
    }

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final PublicKeyCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            x.f(credentialEntry, "credentialEntry");
            Slice slice = credentialEntry.getSlice();
            x.e(slice, "getSlice(...)");
            return PublicKeyCredentialEntry.Companion.fromSlice(slice);
        }
    }

    /* compiled from: WazeSource */
    final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        public static final PublicKeyCredentialEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            PublicKeyCredentialEntry publicKeyCredentialEntryFromSlice = Api28Impl.fromSlice(slice);
            if (publicKeyCredentialEntryFromSlice == null) {
                return null;
            }
            List<SliceItem> items = slice.getItems();
            x.e(items, "getItems(...)");
            Bundle bundle = null;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA)) {
                    bundle = sliceItem.getBundle();
                }
            }
            try {
                CharSequence username = publicKeyCredentialEntryFromSlice.getUsername();
                CharSequence displayName = publicKeyCredentialEntryFromSlice.getDisplayName();
                CharSequence typeDisplayName = publicKeyCredentialEntryFromSlice.getTypeDisplayName();
                PendingIntent pendingIntent = publicKeyCredentialEntryFromSlice.getPendingIntent();
                Icon icon = publicKeyCredentialEntryFromSlice.getIcon();
                Instant lastUsedTime = publicKeyCredentialEntryFromSlice.getLastUsedTime();
                boolean zIsAutoSelectAllowed = publicKeyCredentialEntryFromSlice.isAutoSelectAllowed();
                BeginGetCredentialOption beginGetCredentialOption = publicKeyCredentialEntryFromSlice.getBeginGetCredentialOption();
                x.d(beginGetCredentialOption, "null cannot be cast to non-null type androidx.credentials.provider.BeginGetPublicKeyCredentialOption");
                return new PublicKeyCredentialEntry(username, displayName, typeDisplayName, pendingIntent, icon, lastUsedTime, zIsAutoSelectAllowed, (BeginGetPublicKeyCredentialOption) beginGetCredentialOption, publicKeyCredentialEntryFromSlice.isDefaultIconPreferredAsSingleProvider(), publicKeyCredentialEntryFromSlice.getEntryGroupId(), publicKeyCredentialEntryFromSlice.getAffiliatedDomain(), bundle != null ? BiometricPromptData.Companion.fromBundle(bundle) : null, publicKeyCredentialEntryFromSlice.isAutoSelectAllowedFromOption(), true, publicKeyCredentialEntryFromSlice.isDefaultIconFromSlice);
            } catch (Exception e2) {
                Log.i(PublicKeyCredentialEntry.TAG, "fromSlice failed with: ".concat(String.valueOf(e2.getMessage())));
                return null;
            }
        }

        public static final Slice toSlice(PublicKeyCredentialEntry publicKeyCredentialEntry) {
            x.f(publicKeyCredentialEntry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(publicKeyCredentialEntry.getType(), 1));
            Api28Impl.INSTANCE.addToSlice(publicKeyCredentialEntry, builder);
            INSTANCE.addToSlice(publicKeyCredentialEntry, builder);
            Slice sliceBuild = builder.build();
            x.e(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final void addToSlice(PublicKeyCredentialEntry publicKeyCredentialEntry, Slice.Builder builder) {
            x.f(publicKeyCredentialEntry, "entry");
            x.f(builder, "sliceBuilder");
            BiometricPromptData biometricPromptData = publicKeyCredentialEntry.getBiometricPromptData();
            if (biometricPromptData != null) {
                builder.addInt(biometricPromptData.getAllowedAuthenticators(), null, i.d(CredentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS));
                if (biometricPromptData.getCryptoObject() != null) {
                    builder.addLong(CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()), null, i.d(CredentialEntry.SLICE_HINT_CRYPTO_OP_ID));
                }
                builder.addBundle(BiometricPromptData.Companion.toBundle(biometricPromptData), null, i.d(CredentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA));
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private boolean autoSelectAllowed;
        private final BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption;
        private BiometricPromptData biometricPromptData;
        private final Context context;
        private CharSequence displayName;
        private Icon icon;
        private boolean isDefaultIconPreferredAsSingleProvider;
        private Instant lastUsedTime;
        private final PendingIntent pendingIntent;
        private final CharSequence username;

        public Builder(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption) {
            x.f(context, "context");
            x.f(charSequence, HintConstants.AUTOFILL_HINT_USERNAME);
            x.f(pendingIntent, "pendingIntent");
            x.f(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
            this.context = context;
            this.username = charSequence;
            this.pendingIntent = pendingIntent;
            this.beginGetPublicKeyCredentialOption = beginGetPublicKeyCredentialOption;
        }

        public final PublicKeyCredentialEntry build() {
            if (this.icon == null) {
                this.icon = Icon.createWithResource(this.context, R.drawable.adx_ic_passkey);
            }
            String string = this.context.getString(2131889982);
            x.e(string, "getString(...)");
            PendingIntent pendingIntent = this.pendingIntent;
            Icon icon = this.icon;
            x.c(icon);
            return new PublicKeyCredentialEntry(this.username, this.displayName, string, pendingIntent, icon, this.lastUsedTime, this.autoSelectAllowed, this.beginGetPublicKeyCredentialOption, this.isDefaultIconPreferredAsSingleProvider, null, null, this.biometricPromptData, false, false, false, 30208, null);
        }

        public final Builder setAutoSelectAllowed(boolean z) {
            this.autoSelectAllowed = z;
            return this;
        }

        public final Builder setBiometricPromptData(BiometricPromptData biometricPromptData) {
            this.biometricPromptData = biometricPromptData;
            return this;
        }

        public final Builder setDefaultIconPreferredAsSingleProvider(boolean z) {
            this.isDefaultIconPreferredAsSingleProvider = z;
            return this;
        }

        public final Builder setDisplayName(CharSequence charSequence) {
            this.displayName = charSequence;
            return this;
        }

        public final Builder setIcon(Icon icon) {
            x.f(icon, "icon");
            this.icon = icon;
            return this;
        }

        public final Builder setLastUsedTime(Instant instant) {
            this.lastUsedTime = instant;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublicKeyCredentialEntry(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PendingIntent pendingIntent, Icon icon, Instant instant, boolean z, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, boolean z2, CharSequence charSequence4, CharSequence charSequence5, BiometricPromptData biometricPromptData, boolean z3, boolean z4, boolean z5) {
        super(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, beginGetPublicKeyCredentialOption, charSequence4 == null ? charSequence : charSequence4, z2, charSequence5, biometricPromptData);
        x.f(charSequence, HintConstants.AUTOFILL_HINT_USERNAME);
        x.f(charSequence3, "typeDisplayName");
        x.f(pendingIntent, "pendingIntent");
        x.f(icon, "icon");
        x.f(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
        this.username = charSequence;
        this.displayName = charSequence2;
        this.typeDisplayName = charSequence3;
        this.pendingIntent = pendingIntent;
        this.icon = icon;
        this.lastUsedTime = instant;
        this.isAutoSelectAllowed = z;
        this.isCreatedFromSlice = z4;
        this.isDefaultIconFromSlice = z5;
        this.isAutoSelectAllowedFromOption = z3;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("username must not be empty");
        }
        if (charSequence3.length() <= 0) {
            throw new IllegalArgumentException("typeDisplayName must not be empty");
        }
    }

    public static final PublicKeyCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
        return Companion.fromCredentialEntry(credentialEntry);
    }

    public static final PublicKeyCredentialEntry fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(PublicKeyCredentialEntry publicKeyCredentialEntry) {
        return Companion.toSlice(publicKeyCredentialEntry);
    }

    public final CharSequence getDisplayName() {
        return this.displayName;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final Instant getLastUsedTime() {
        return this.lastUsedTime;
    }

    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final CharSequence getTypeDisplayName() {
        return this.typeDisplayName;
    }

    public final CharSequence getUsername() {
        return this.username;
    }

    public final boolean hasDefaultIcon() {
        return Api28Impl.isDefaultIcon(this);
    }

    public final boolean isAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    public final boolean isAutoSelectAllowedFromOption() {
        return this.isAutoSelectAllowedFromOption;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final PublicKeyCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            x.f(credentialEntry, "credentialEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCredentialEntry(credentialEntry);
            }
            return null;
        }

        public final PublicKeyCredentialEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromSlice(slice) : Api28Impl.fromSlice(slice);
        }

        public final void marshall$credentials(PublicKeyCredentialEntry publicKeyCredentialEntry, Bundle bundle, int i2) {
            x.f(publicKeyCredentialEntry, "<this>");
            x.f(bundle, "bundle");
            CredentialEntry.Companion.marshallCommonProperties$credentials(publicKeyCredentialEntry, bundle, i2);
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX + i2, publicKeyCredentialEntry.getPendingIntent());
            bundle.putBoolean(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX), publicKeyCredentialEntry.isAutoSelectAllowed());
            bundle.putBoolean(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX), publicKeyCredentialEntry.isAutoSelectAllowedFromOption());
            bundle.putBoolean(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX), publicKeyCredentialEntry.hasDefaultIcon());
            bundle.putCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_TITLE_PREFIX), publicKeyCredentialEntry.getUsername());
            bundle.putCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX), publicKeyCredentialEntry.getTypeDisplayName());
            bundle.putParcelable(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX), publicKeyCredentialEntry.getIcon());
            CharSequence displayName = publicKeyCredentialEntry.getDisplayName();
            if (displayName != null) {
                bundle.putCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX), displayName);
            }
            Instant lastUsedTime = publicKeyCredentialEntry.getLastUsedTime();
            if (lastUsedTime != null) {
                bundle.putLong(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX), lastUsedTime.toEpochMilli());
            }
        }

        public final Slice toSlice(PublicKeyCredentialEntry publicKeyCredentialEntry) {
            x.f(publicKeyCredentialEntry, "entry");
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toSlice(publicKeyCredentialEntry) : Api28Impl.toSlice(publicKeyCredentialEntry);
        }

        public final PublicKeyCredentialEntry unmarshall$credentials(Bundle bundle, int i2) {
            Instant instantOfEpochMilli;
            x.f(bundle, "bundle");
            try {
                String string = bundle.getString(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX));
                x.c(string);
                Bundle bundle2 = bundle.getBundle(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX));
                x.c(bundle2);
                CharSequence charSequence = bundle.getCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX));
                boolean z = bundle.getBoolean(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX), false);
                CharSequence charSequence2 = bundle.getCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX));
                Parcelable parcelable = bundle.getParcelable(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX));
                x.c(parcelable);
                PendingIntent pendingIntent = (PendingIntent) parcelable;
                boolean z2 = bundle.getBoolean(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX), false);
                boolean z3 = bundle.getBoolean(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX), false);
                boolean z4 = bundle.getBoolean(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX), false);
                CharSequence charSequence3 = bundle.getCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_TITLE_PREFIX));
                x.c(charSequence3);
                CharSequence charSequence4 = bundle.getCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX));
                x.c(charSequence4);
                Parcelable parcelable2 = bundle.getParcelable(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX));
                x.c(parcelable2);
                Icon icon = (Icon) parcelable2;
                CharSequence charSequence5 = bundle.getCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX));
                if (bundle.containsKey(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX))) {
                    try {
                        instantOfEpochMilli = Instant.ofEpochMilli(bundle.getLong(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX)));
                    } catch (Exception unused) {
                    }
                } else {
                    instantOfEpochMilli = null;
                }
                return new PublicKeyCredentialEntry(charSequence3, charSequence5, charSequence4, pendingIntent, icon, instantOfEpochMilli, z2, BeginGetPublicKeyCredentialOption.Companion.createFrom$credentials(bundle2, string), z, charSequence, charSequence2, null, z3, true, z4, 2048, null);
            } catch (Exception unused2) {
                return null;
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PublicKeyCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, int i2, o oVar) {
        Icon icon2;
        if ((i2 & 64) != 0) {
            Icon iconCreateWithResource = Icon.createWithResource(context, R.drawable.adx_ic_passkey);
            x.e(iconCreateWithResource, "createWithResource(...)");
            icon2 = iconCreateWithResource;
        } else {
            icon2 = icon;
        }
        int i3 = i2 & 16;
        this(context, charSequence, pendingIntent, beginGetPublicKeyCredentialOption, i3 != 0 ? null : charSequence2, (i2 & 32) != 0 ? null : instant, icon2, ((i2 & 128) == 0) & z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PublicKeyCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, boolean z2) {
        x.f(context, "context");
        x.f(charSequence, HintConstants.AUTOFILL_HINT_USERNAME);
        x.f(pendingIntent, "pendingIntent");
        x.f(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
        x.f(icon, "icon");
        String string = context.getString(2131889982);
        x.e(string, "getString(...)");
        this(charSequence, charSequence2, string, pendingIntent, icon, instant, z, beginGetPublicKeyCredentialOption, z2, null, null, null, false, false, false, 32256, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PublicKeyCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, boolean z2, int i2, o oVar) {
        Icon icon2;
        if ((i2 & 64) != 0) {
            Icon iconCreateWithResource = Icon.createWithResource(context, R.drawable.adx_ic_passkey);
            x.e(iconCreateWithResource, "createWithResource(...)");
            icon2 = iconCreateWithResource;
        } else {
            icon2 = icon;
        }
        int i3 = i2 & 16;
        this(context, charSequence, pendingIntent, beginGetPublicKeyCredentialOption, i3 != 0 ? null : charSequence2, (i2 & 32) != 0 ? null : instant, icon2, ((i2 & 128) == 0) & z, ((i2 & 256) == 0) & z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PublicKeyCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, boolean z2, BiometricPromptData biometricPromptData) {
        x.f(context, "context");
        x.f(charSequence, HintConstants.AUTOFILL_HINT_USERNAME);
        x.f(pendingIntent, "pendingIntent");
        x.f(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
        x.f(icon, "icon");
        String string = context.getString(2131889982);
        x.e(string, "getString(...)");
        this(charSequence, charSequence2, string, pendingIntent, icon, instant, z, beginGetPublicKeyCredentialOption, z2, null, null, biometricPromptData, false, false, false, 30208, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PublicKeyCredentialEntry(android.content.Context r14, java.lang.CharSequence r15, android.app.PendingIntent r16, androidx.credentials.provider.BeginGetPublicKeyCredentialOption r17, java.lang.CharSequence r18, j$.time.Instant r19, android.graphics.drawable.Icon r20, boolean r21, boolean r22, androidx.credentials.provider.BiometricPromptData r23, int r24, h.g.b.o r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 64
            if (r1 == 0) goto L14
            r1 = 2131230876(0x7f08009c, float:1.8077817E38)
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithResource(r14, r1)
            java.lang.String r2 = "createWithResource(...)"
            h.g.b.x.e(r1, r2)
            r9 = r1
            goto L16
        L14:
            r9 = r20
        L16:
            r1 = r0 & 32
            r2 = r0 & 16
            r4 = 0
            if (r1 == 0) goto L1f
            r8 = r4
            goto L21
        L1f:
            r8 = r19
        L21:
            if (r2 == 0) goto L25
            r7 = r4
            goto L27
        L25:
            r7 = r18
        L27:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 0
            r5 = 1
            if (r1 == 0) goto L2f
            r1 = r2
            goto L30
        L2f:
            r1 = r5
        L30:
            r10 = r1 & r21
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L37
            goto L38
        L37:
            r2 = r5
        L38:
            r11 = r2 & r22
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L47
            r12 = r4
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r4 = r15
            goto L50
        L47:
            r12 = r23
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
        L50:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.PublicKeyCredentialEntry.<init>(android.content.Context, java.lang.CharSequence, android.app.PendingIntent, androidx.credentials.provider.BeginGetPublicKeyCredentialOption, java.lang.CharSequence, j$.time.Instant, android.graphics.drawable.Icon, boolean, boolean, androidx.credentials.provider.BiometricPromptData, int, h.g.b.o):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PublicKeyCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z) {
        x.f(context, "context");
        x.f(charSequence, HintConstants.AUTOFILL_HINT_USERNAME);
        x.f(pendingIntent, "pendingIntent");
        x.f(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
        x.f(icon, "icon");
        String string = context.getString(2131889982);
        x.e(string, "getString(...)");
        this(charSequence, charSequence2, string, pendingIntent, icon, instant, z, beginGetPublicKeyCredentialOption, false, null, null, null, false, false, false, 32256, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PublicKeyCredentialEntry(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PendingIntent pendingIntent, Icon icon, Instant instant, boolean z, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, boolean z2, CharSequence charSequence4, CharSequence charSequence5, BiometricPromptData biometricPromptData, boolean z3, boolean z4, boolean z5, int i2, o oVar) {
        boolean zExtractAutoSelectValue$credentials = (i2 & 4096) != 0 ? CredentialOption.Companion.extractAutoSelectValue$credentials(beginGetPublicKeyCredentialOption.getCandidateQueryData()) : z3;
        int i3 = i2 & 1024;
        int i4 = i2 & 512;
        BiometricPromptData biometricPromptData2 = (i2 & 2048) != 0 ? null : biometricPromptData;
        this(charSequence, charSequence2, charSequence3, pendingIntent, icon, instant, z, beginGetPublicKeyCredentialOption, z2, i4 != 0 ? charSequence : charSequence4, i3 != 0 ? null : charSequence5, biometricPromptData2, zExtractAutoSelectValue$credentials, ((i2 & 8192) == 0) & z4, ((i2 & 16384) == 0) & z5);
    }
}
