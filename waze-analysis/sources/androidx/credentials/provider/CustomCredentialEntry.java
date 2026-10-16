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
import androidx.credentials.CredentialOption;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.R;
import com.waze.gas.GasNativeManager;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import j$.time.Instant;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CustomCredentialEntry extends CredentialEntry {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CredentialEntry";
    private final Icon icon;
    private final boolean isAutoSelectAllowed;
    private final boolean isAutoSelectAllowedFromOption;
    private boolean isCreatedFromSlice;
    private boolean isDefaultIconFromSlice;
    private final Instant lastUsedTime;
    private final PendingIntent pendingIntent;
    private final CharSequence subtitle;
    private final CharSequence title;
    private final String type;
    private final CharSequence typeDisplayName;

    /* compiled from: WazeSource */
    final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        public static final CustomCredentialEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            SliceSpec spec = slice.getSpec();
            x.c(spec);
            String type = spec.getType();
            x.e(type, "getType(...)");
            List<SliceItem> items = slice.getItems();
            x.e(items, "getItems(...)");
            Iterator it = items.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            CharSequence text = null;
            CharSequence text2 = null;
            PendingIntent action = null;
            CharSequence text3 = null;
            CharSequence text4 = null;
            Icon icon = null;
            Instant instantOfEpochMilli = null;
            CharSequence text5 = null;
            CharSequence text6 = null;
            while (it.hasNext()) {
                SliceItem sliceItem = (SliceItem) it.next();
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_OPTION_ID)) {
                    text = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)) {
                    text5 = sliceItem.getText();
                } else {
                    Iterator it2 = it;
                    if (!sliceItem.hasHint(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)) {
                        if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN)) {
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
                                it = it2;
                                z = true;
                            }
                        } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION)) {
                            it = it2;
                            z3 = true;
                        } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID)) {
                            it = it2;
                            z4 = true;
                        }
                        it = it2;
                    } else if (x.n(sliceItem.getText(), CredentialEntry.TRUE_STRING)) {
                        it = it2;
                        z2 = true;
                    } else {
                        it = it2;
                    }
                }
            }
            try {
                x.c(text2);
                x.c(action);
                x.c(icon);
                x.c(text);
                return new CustomCredentialEntry(type, text2, action, z, text3, text4, icon, instantOfEpochMilli, new BeginGetCustomCredentialOption(text.toString(), type, new Bundle()), z2, text5, text6, null, z3, true, z4, 4096, null);
            } catch (Exception e2) {
                Log.i(CustomCredentialEntry.TAG, "fromSlice failed with: ".concat(String.valueOf(e2.getMessage())));
                return null;
            }
        }

        public static final boolean isDefaultIcon(CustomCredentialEntry customCredentialEntry) {
            x.f(customCredentialEntry, "entry");
            return customCredentialEntry.isCreatedFromSlice ? customCredentialEntry.isDefaultIconFromSlice : customCredentialEntry.getIcon().getType() == 2 && customCredentialEntry.getIcon().getResId() == R.drawable.adx_ic_other_sign_in;
        }

        public static final Slice toSlice(CustomCredentialEntry customCredentialEntry) {
            x.f(customCredentialEntry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(customCredentialEntry.getType(), 1));
            INSTANCE.addToSlice(customCredentialEntry, builder);
            Slice sliceBuild = builder.build();
            x.e(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final void addToSlice(CustomCredentialEntry customCredentialEntry, Slice.Builder builder) {
            x.f(customCredentialEntry, "entry");
            x.f(builder, "sliceBuilder");
            BeginGetCredentialOption beginGetCredentialOption = customCredentialEntry.getBeginGetCredentialOption();
            CharSequence entryGroupId = customCredentialEntry.getEntryGroupId();
            boolean zIsDefaultIconPreferredAsSingleProvider = customCredentialEntry.isDefaultIconPreferredAsSingleProvider();
            String str = CredentialEntry.FALSE_STRING;
            builder.addText(beginGetCredentialOption.getId(), null, i.d(CredentialEntry.SLICE_HINT_OPTION_ID)).addText(entryGroupId, null, i.d(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)).addText(true != zIsDefaultIconPreferredAsSingleProvider ? CredentialEntry.FALSE_STRING : CredentialEntry.TRUE_STRING, null, i.d(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)).addText(customCredentialEntry.getAffiliatedDomain(), null, i.d(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN));
            CharSequence title = customCredentialEntry.getTitle();
            CharSequence subtitle = customCredentialEntry.getSubtitle();
            PendingIntent pendingIntent = customCredentialEntry.getPendingIntent();
            CharSequence typeDisplayName = customCredentialEntry.getTypeDisplayName();
            Instant lastUsedTime = customCredentialEntry.getLastUsedTime();
            Icon icon = customCredentialEntry.getIcon();
            if (true == customCredentialEntry.isAutoSelectAllowed()) {
                str = CredentialEntry.TRUE_STRING;
            }
            builder.addText(typeDisplayName, null, i.d(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)).addText(title, null, i.d(CredentialEntry.SLICE_HINT_TITLE)).addText(subtitle, null, i.d(CredentialEntry.SLICE_HINT_SUBTITLE)).addText(str, null, i.d(CredentialEntry.SLICE_HINT_AUTO_ALLOWED)).addIcon(icon, null, i.d(CredentialEntry.SLICE_HINT_ICON));
            try {
                if (customCredentialEntry.hasDefaultIcon()) {
                    builder.addInt(1, null, i.d(CredentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID));
                }
            } catch (IllegalStateException unused) {
            }
            if (customCredentialEntry.isAutoSelectAllowedFromOption()) {
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

        public static final CustomCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            x.f(credentialEntry, "credentialEntry");
            Slice slice = credentialEntry.getSlice();
            x.e(slice, "getSlice(...)");
            return CustomCredentialEntry.Companion.fromSlice(slice);
        }
    }

    /* compiled from: WazeSource */
    final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        public static final CustomCredentialEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            CustomCredentialEntry customCredentialEntryFromSlice = Api28Impl.fromSlice(slice);
            if (customCredentialEntryFromSlice == null) {
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
                return new CustomCredentialEntry(customCredentialEntryFromSlice.getType(), customCredentialEntryFromSlice.getTitle(), customCredentialEntryFromSlice.getPendingIntent(), customCredentialEntryFromSlice.isAutoSelectAllowed(), customCredentialEntryFromSlice.getSubtitle(), customCredentialEntryFromSlice.getTypeDisplayName(), customCredentialEntryFromSlice.getIcon(), customCredentialEntryFromSlice.getLastUsedTime(), customCredentialEntryFromSlice.getBeginGetCredentialOption(), customCredentialEntryFromSlice.isDefaultIconPreferredAsSingleProvider(), customCredentialEntryFromSlice.getEntryGroupId(), customCredentialEntryFromSlice.getAffiliatedDomain(), bundle != null ? BiometricPromptData.Companion.fromBundle(bundle) : null, customCredentialEntryFromSlice.isAutoSelectAllowedFromOption(), true, customCredentialEntryFromSlice.isDefaultIconFromSlice);
            } catch (Exception e2) {
                Log.i(CustomCredentialEntry.TAG, "fromSlice failed with: ".concat(String.valueOf(e2.getMessage())));
                return null;
            }
        }

        public static final Slice toSlice(CustomCredentialEntry customCredentialEntry) {
            x.f(customCredentialEntry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(customCredentialEntry.getType(), 1));
            Api28Impl.INSTANCE.addToSlice(customCredentialEntry, builder);
            INSTANCE.addToSlice(customCredentialEntry, builder);
            Slice sliceBuild = builder.build();
            x.e(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final void addToSlice(CustomCredentialEntry customCredentialEntry, Slice.Builder builder) {
            x.f(customCredentialEntry, "entry");
            x.f(builder, "sliceBuilder");
            BiometricPromptData biometricPromptData = customCredentialEntry.getBiometricPromptData();
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
        private final BeginGetCredentialOption beginGetCredentialOption;
        private BiometricPromptData biometricPromptData;
        private final Context context;
        private CharSequence entryGroupId;
        private Icon icon;
        private boolean isDefaultIconPreferredAsSingleProvider;
        private Instant lastUsedTime;
        private final PendingIntent pendingIntent;
        private CharSequence subtitle;
        private final CharSequence title;
        private final String type;
        private CharSequence typeDisplayName;

        public Builder(Context context, String str, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption) {
            x.f(context, "context");
            x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            x.f(charSequence, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
            x.f(pendingIntent, "pendingIntent");
            x.f(beginGetCredentialOption, "beginGetCredentialOption");
            this.context = context;
            this.type = str;
            this.title = charSequence;
            this.pendingIntent = pendingIntent;
            this.beginGetCredentialOption = beginGetCredentialOption;
            this.entryGroupId = charSequence;
        }

        public final CustomCredentialEntry build() {
            if (this.icon == null) {
                this.icon = Icon.createWithResource(this.context, R.drawable.adx_ic_other_sign_in);
            }
            String str = this.type;
            CharSequence charSequence = this.title;
            PendingIntent pendingIntent = this.pendingIntent;
            boolean z = this.autoSelectAllowed;
            CharSequence charSequence2 = this.subtitle;
            CharSequence charSequence3 = this.typeDisplayName;
            Icon icon = this.icon;
            x.c(icon);
            return new CustomCredentialEntry(str, charSequence, pendingIntent, z, charSequence2, charSequence3, icon, this.lastUsedTime, this.beginGetCredentialOption, this.isDefaultIconPreferredAsSingleProvider, this.entryGroupId, null, this.biometricPromptData, false, false, false, 59392, null);
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

        public final Builder setEntryGroupId(CharSequence charSequence) {
            x.f(charSequence, "entryGroupId");
            if (charSequence.length() <= 0) {
                throw new IllegalArgumentException("entryGroupId must not be empty");
            }
            this.entryGroupId = charSequence;
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

        public final Builder setSubtitle(CharSequence charSequence) {
            this.subtitle = charSequence;
            return this;
        }

        public final Builder setTypeDisplayName(CharSequence charSequence) {
            this.typeDisplayName = charSequence;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCredentialEntry(String str, CharSequence charSequence, PendingIntent pendingIntent, boolean z, CharSequence charSequence2, CharSequence charSequence3, Icon icon, Instant instant, BeginGetCredentialOption beginGetCredentialOption, boolean z2, CharSequence charSequence4, CharSequence charSequence5, BiometricPromptData biometricPromptData, boolean z3, boolean z4, boolean z5) {
        super(str, beginGetCredentialOption, charSequence4 == null ? charSequence : charSequence4, z2, charSequence5, biometricPromptData);
        x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(charSequence, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(pendingIntent, "pendingIntent");
        x.f(icon, "icon");
        x.f(beginGetCredentialOption, "beginGetCredentialOption");
        this.type = str;
        this.title = charSequence;
        this.pendingIntent = pendingIntent;
        this.isAutoSelectAllowed = z;
        this.subtitle = charSequence2;
        this.typeDisplayName = charSequence3;
        this.icon = icon;
        this.lastUsedTime = instant;
        this.isCreatedFromSlice = z4;
        this.isDefaultIconFromSlice = z5;
        this.isAutoSelectAllowedFromOption = z3;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    public static final CustomCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
        return Companion.fromCredentialEntry(credentialEntry);
    }

    public static final CustomCredentialEntry fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(CustomCredentialEntry customCredentialEntry) {
        return Companion.toSlice(customCredentialEntry);
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

    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    @Override // androidx.credentials.provider.CredentialEntry
    public String getType() {
        return this.type;
    }

    public final CharSequence getTypeDisplayName() {
        return this.typeDisplayName;
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

        public final CustomCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            x.f(credentialEntry, "credentialEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCredentialEntry(credentialEntry);
            }
            return null;
        }

        public final CustomCredentialEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromSlice(slice) : Api28Impl.fromSlice(slice);
        }

        public final void marshall$credentials(CustomCredentialEntry customCredentialEntry, Bundle bundle, int i2) {
            x.f(customCredentialEntry, "<this>");
            x.f(bundle, "bundle");
            CredentialEntry.Companion.marshallCommonProperties$credentials(customCredentialEntry, bundle, i2);
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX + i2, customCredentialEntry.getPendingIntent());
            bundle.putBoolean(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX), customCredentialEntry.isAutoSelectAllowed());
            bundle.putBoolean(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX), customCredentialEntry.isAutoSelectAllowedFromOption());
            bundle.putBoolean(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX), customCredentialEntry.hasDefaultIcon());
            bundle.putCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_TITLE_PREFIX), customCredentialEntry.getTitle());
            bundle.putCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX), customCredentialEntry.getTypeDisplayName());
            bundle.putParcelable(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX), customCredentialEntry.getIcon());
            CharSequence subtitle = customCredentialEntry.getSubtitle();
            if (subtitle != null) {
                bundle.putCharSequence(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX), subtitle);
            }
            Instant lastUsedTime = customCredentialEntry.getLastUsedTime();
            if (lastUsedTime != null) {
                bundle.putLong(a.a(i2, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX), lastUsedTime.toEpochMilli());
            }
        }

        public final Slice toSlice(CustomCredentialEntry customCredentialEntry) {
            x.f(customCredentialEntry, "entry");
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toSlice(customCredentialEntry) : Api28Impl.toSlice(customCredentialEntry);
        }

        public final CustomCredentialEntry unmarshall$credentials(Bundle bundle, int i2, String str) {
            Instant instantOfEpochMilli;
            x.f(bundle, "bundle");
            x.f(str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
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
                return new CustomCredentialEntry(str, charSequence3, pendingIntent, z2, charSequence5, charSequence4, icon, instantOfEpochMilli, new BeginGetCustomCredentialOption(string, str, bundle2), z, charSequence, charSequence2, null, z3, true, z4);
            } catch (Exception unused2) {
                return null;
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z, int i2, o oVar) {
        Icon icon2;
        if ((i2 & 128) != 0) {
            Icon iconCreateWithResource = Icon.createWithResource(context, R.drawable.adx_ic_other_sign_in);
            x.e(iconCreateWithResource, "createWithResource(...)");
            icon2 = iconCreateWithResource;
        } else {
            icon2 = icon;
        }
        int i3 = i2 & 32;
        int i4 = i2 & 16;
        Instant instant2 = (i2 & 64) != 0 ? null : instant;
        this(context, charSequence, pendingIntent, beginGetCredentialOption, i4 != 0 ? null : charSequence2, i3 != 0 ? null : charSequence3, instant2, icon2, ((i2 & 256) == 0) & z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z, CharSequence charSequence4, boolean z2) {
        this(beginGetCredentialOption.getType(), charSequence, pendingIntent, z, charSequence2, charSequence3, icon, instant, beginGetCredentialOption, z2, charSequence4.length() == 0 ? charSequence : charSequence4, null, null, false, false, false, 63488, null);
        x.f(context, "context");
        x.f(charSequence, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(pendingIntent, "pendingIntent");
        x.f(beginGetCredentialOption, "beginGetCredentialOption");
        x.f(icon, "icon");
        x.f(charSequence4, "entryGroupId");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z, CharSequence charSequence4, boolean z2, int i2, o oVar) {
        Icon icon2;
        if ((i2 & 128) != 0) {
            Icon iconCreateWithResource = Icon.createWithResource(context, R.drawable.adx_ic_other_sign_in);
            x.e(iconCreateWithResource, "createWithResource(...)");
            icon2 = iconCreateWithResource;
        } else {
            icon2 = icon;
        }
        int i3 = i2 & 32;
        int i4 = i2 & 16;
        Instant instant2 = (i2 & 64) != 0 ? null : instant;
        this(context, charSequence, pendingIntent, beginGetCredentialOption, i4 != 0 ? null : charSequence2, i3 != 0 ? null : charSequence3, instant2, icon2, ((i2 & 256) == 0) & z, (i2 & 512) != 0 ? charSequence : charSequence4, ((i2 & 1024) == 0) & z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z, CharSequence charSequence4, boolean z2, BiometricPromptData biometricPromptData) {
        this(beginGetCredentialOption.getType(), charSequence, pendingIntent, z, charSequence2, charSequence3, icon, instant, beginGetCredentialOption, z2, charSequence4.length() == 0 ? charSequence : charSequence4, null, biometricPromptData, false, false, false, 59392, null);
        x.f(context, "context");
        x.f(charSequence, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(pendingIntent, "pendingIntent");
        x.f(beginGetCredentialOption, "beginGetCredentialOption");
        x.f(icon, "icon");
        x.f(charSequence4, "entryGroupId");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CustomCredentialEntry(android.content.Context r16, java.lang.CharSequence r17, android.app.PendingIntent r18, androidx.credentials.provider.BeginGetCredentialOption r19, java.lang.CharSequence r20, java.lang.CharSequence r21, j$.time.Instant r22, android.graphics.drawable.Icon r23, boolean r24, java.lang.CharSequence r25, boolean r26, androidx.credentials.provider.BiometricPromptData r27, int r28, h.g.b.o r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L16
            r1 = 2131230875(0x7f08009b, float:1.8077815E38)
            r3 = r16
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithResource(r3, r1)
            java.lang.String r2 = "createWithResource(...)"
            h.g.b.x.e(r1, r2)
            r10 = r1
            goto L1a
        L16:
            r3 = r16
            r10 = r23
        L1a:
            r1 = r0 & 64
            r2 = r0 & 32
            r4 = r0 & 16
            r5 = 0
            if (r1 == 0) goto L25
            r9 = r5
            goto L27
        L25:
            r9 = r22
        L27:
            if (r2 == 0) goto L2b
            r8 = r5
            goto L2d
        L2b:
            r8 = r21
        L2d:
            if (r4 == 0) goto L31
            r7 = r5
            goto L33
        L31:
            r7 = r20
        L33:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L3b
            r1 = r2
            goto L3c
        L3b:
            r1 = r4
        L3c:
            r11 = r1 & r24
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L45
            r12 = r17
            goto L47
        L45:
            r12 = r25
        L47:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L4c
            goto L4d
        L4c:
            r2 = r4
        L4d:
            r13 = r2 & r26
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L5c
            r14 = r5
            r2 = r15
            r4 = r17
            r6 = r19
            r5 = r18
            goto L65
        L5c:
            r14 = r27
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
        L65:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.CustomCredentialEntry.<init>(android.content.Context, java.lang.CharSequence, android.app.PendingIntent, androidx.credentials.provider.BeginGetCredentialOption, java.lang.CharSequence, java.lang.CharSequence, j$.time.Instant, android.graphics.drawable.Icon, boolean, java.lang.CharSequence, boolean, androidx.credentials.provider.BiometricPromptData, int, h.g.b.o):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z) {
        this(beginGetCredentialOption.getType(), charSequence, pendingIntent, z, charSequence2, charSequence3, icon, instant, beginGetCredentialOption, false, null, null, null, false, false, false, 64512, null);
        x.f(context, "context");
        x.f(charSequence, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(pendingIntent, "pendingIntent");
        x.f(beginGetCredentialOption, "beginGetCredentialOption");
        x.f(icon, "icon");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomCredentialEntry(String str, CharSequence charSequence, PendingIntent pendingIntent, boolean z, CharSequence charSequence2, CharSequence charSequence3, Icon icon, Instant instant, BeginGetCredentialOption beginGetCredentialOption, boolean z2, CharSequence charSequence4, CharSequence charSequence5, BiometricPromptData biometricPromptData, boolean z3, boolean z4, boolean z5, int i2, o oVar) {
        boolean zExtractAutoSelectValue$credentials = (i2 & 8192) != 0 ? CredentialOption.Companion.extractAutoSelectValue$credentials(beginGetCredentialOption.getCandidateQueryData()) : z3;
        int i3 = i2 & 2048;
        int i4 = i2 & 1024;
        BiometricPromptData biometricPromptData2 = (i2 & 4096) != 0 ? null : biometricPromptData;
        this(str, charSequence, pendingIntent, z, charSequence2, charSequence3, icon, instant, beginGetCredentialOption, z2, i4 != 0 ? charSequence : charSequence4, i3 != 0 ? null : charSequence5, biometricPromptData2, zExtractAutoSelectValue$credentials, ((i2 & 16384) == 0) & z4, ((i2 & 32768) == 0) & z5);
    }
}
