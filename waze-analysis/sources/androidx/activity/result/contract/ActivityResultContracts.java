package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.content.ContextCompat;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import e.c.d.a;
import h.a.c;
import h.a.i;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import h.k;
import h.k.n;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ActivityResultContracts {

    /* compiled from: WazeSource */
    public final class PickContact extends ActivityResultContract<Void, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Void r2) {
            x.f(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            x.e(type, "setType(...)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: WazeSource */
    public final class RequestPermission extends ActivityResultContract<String, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String str) {
            x.f(context, "context");
            x.f(str, "input");
            return RequestMultiplePermissions.Companion.createIntent$activity(new String[]{str});
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, String str) {
            x.f(context, "context");
            x.f(str, "input");
            if (ContextCompat.checkSelfPermission(context, str) == 0) {
                return new ActivityResultContract.SynchronousResult<>(true);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Boolean parseResult(int i2, Intent intent) {
            boolean z = false;
            if (intent == null || i2 != -1) {
                return false;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS);
            if (intArrayExtra != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= intArrayExtra.length) {
                        break;
                    }
                    if (intArrayExtra[i3] == 0) {
                        z = true;
                        break;
                    }
                    i3++;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    private ActivityResultContracts() {
    }

    /* compiled from: WazeSource */
    public class PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {
        public static final String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR = "androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR";
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER = "androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER";
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB = "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB";
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        public static final String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";
        public static final String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* compiled from: WazeSource */
        public final class ImageAndVideo implements VisualMediaType {
            public static final ImageAndVideo INSTANCE = new ImageAndVideo();

            private ImageAndVideo() {
            }
        }

        /* compiled from: WazeSource */
        public final class ImageOnly implements VisualMediaType {
            public static final ImageOnly INSTANCE = new ImageOnly();

            private ImageOnly() {
            }
        }

        /* compiled from: WazeSource */
        public final class SingleMimeType implements VisualMediaType {
            private final String mimeType;

            public SingleMimeType(String str) {
                x.f(str, "mimeType");
                this.mimeType = str;
            }

            public final String getMimeType() {
                return this.mimeType;
            }
        }

        /* compiled from: WazeSource */
        public final class VideoOnly implements VisualMediaType {
            public static final VideoOnly INSTANCE = new VideoOnly();

            private VideoOnly() {
            }
        }

        /* compiled from: WazeSource */
        public interface VisualMediaType {
        }

        public static final boolean isPhotoPickerAvailable() {
            return Companion.isPhotoPickerAvailable();
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            MediaCapabilities mediaCapabilitiesForTranscoding;
            x.f(context, "context");
            x.f(pickVisualMediaRequest, "input");
            Companion companion = Companion;
            if (companion.isSystemPickerAvailable$activity()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.getVisualMimeType$activity(pickVisualMediaRequest.getMediaType()));
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", pickVisualMediaRequest.getDefaultTab().getValue());
                if (pickVisualMediaRequest.isCustomAccentColorApplied()) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", pickVisualMediaRequest.getAccentColor());
                }
                if (Build.VERSION.SDK_INT >= 33 && (mediaCapabilitiesForTranscoding = pickVisualMediaRequest.getMediaCapabilitiesForTranscoding()) != null) {
                    intent.putExtra("android.provider.extra.MEDIA_CAPABILITIES", mediaCapabilitiesForTranscoding.toApplicationMediaCapabilities$activity());
                }
                return intent;
            }
            if (!companion.isSystemFallbackPickerAvailable$activity(context)) {
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.setType(companion.getVisualMimeType$activity(pickVisualMediaRequest.getMediaType()));
                if (intent2.getType() == null) {
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent2;
            }
            ResolveInfo systemFallbackPicker$activity = companion.getSystemFallbackPicker$activity(context);
            if (systemFallbackPicker$activity == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = systemFallbackPicker$activity.activityInfo;
            Intent intent3 = new Intent(ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
            intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent3.setType(companion.getVisualMimeType$activity(pickVisualMediaRequest.getMediaType()));
            intent3.putExtra(EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB, pickVisualMediaRequest.getDefaultTab().getValue());
            if (!pickVisualMediaRequest.isCustomAccentColorApplied()) {
                return intent3;
            }
            intent3.putExtra(EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR, pickVisualMediaRequest.getAccentColor());
            return intent3;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult2(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            x.f(context, "context");
            x.f(pickVisualMediaRequest, "input");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            return data == null ? (Uri) i.R(GetMultipleContents.Companion.getClipDataUris$activity(intent)) : data;
        }

        /* compiled from: WazeSource */
        public final class MediaCapabilities {
            public static final Companion Companion = new Companion(null);
            public static final int TYPE_DOLBY_VISION = 3;
            public static final int TYPE_HDR10 = 1;
            public static final int TYPE_HDR10_PLUS = 2;
            public static final int TYPE_HLG10 = 0;
            private Set<Integer> supportedHdrTypes = a.p();

            /* compiled from: WazeSource */
            public final class Builder {
                private Set<Integer> supportedHdrTypes = new LinkedHashSet();

                public final Builder addSupportedHdrType(int i2) {
                    this.supportedHdrTypes.add(Integer.valueOf(i2));
                    return this;
                }

                public final MediaCapabilities build() {
                    MediaCapabilities mediaCapabilities = new MediaCapabilities();
                    mediaCapabilities.setSupportedHdrTypes$activity(this.supportedHdrTypes);
                    return mediaCapabilities;
                }
            }

            public final Set<Integer> getSupportedHdrTypes() {
                return this.supportedHdrTypes;
            }

            public final void setSupportedHdrTypes$activity(Set<Integer> set) {
                x.f(set, "<set-?>");
                this.supportedHdrTypes = set;
            }

            public final ApplicationMediaCapabilities toApplicationMediaCapabilities$activity() {
                ApplicationMediaCapabilities.Builder builder = new ApplicationMediaCapabilities.Builder();
                builder.addSupportedVideoMimeType(MimeTypes.VIDEO_H265);
                Iterator<T> it = this.supportedHdrTypes.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (iIntValue == 0) {
                        builder.addSupportedHdrType("android.media.feature.hdr.hlg");
                    } else if (iIntValue == 1) {
                        builder.addSupportedHdrType("android.media.feature.hdr.hdr10");
                    } else if (iIntValue == 2) {
                        builder.addSupportedHdrType("android.media.feature.hdr.hdr10_plus");
                    } else if (iIntValue == 3) {
                        builder.addSupportedHdrType("android.media.feature.hdr.dolby_vision");
                    }
                }
                ApplicationMediaCapabilities applicationMediaCapabilitiesBuild = builder.build();
                x.e(applicationMediaCapabilitiesBuild, "build(...)");
                return applicationMediaCapabilitiesBuild;
            }

            /* compiled from: WazeSource */
            public final class Companion {

                /* compiled from: WazeSource */
                @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
                @Retention(RetentionPolicy.SOURCE)
                public @interface HdrType {
                }

                private Companion() {
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final ResolveInfo getSystemFallbackPicker$activity(Context context) {
                x.f(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES), ParsableByteArray.INVALID_CODE_POINT);
            }

            public final String getVisualMimeType$activity(VisualMediaType visualMediaType) {
                x.f(visualMediaType, "input");
                if (visualMediaType instanceof ImageOnly) {
                    return "image/*";
                }
                if (visualMediaType instanceof VideoOnly) {
                    return "video/*";
                }
                if (visualMediaType instanceof SingleMimeType) {
                    return ((SingleMimeType) visualMediaType).getMimeType();
                }
                if (visualMediaType instanceof ImageAndVideo) {
                    return null;
                }
                throw new h.i();
            }

            public final boolean isPhotoPickerAvailable(Context context) {
                x.f(context, "context");
                return isSystemPickerAvailable$activity() || isSystemFallbackPickerAvailable$activity(context);
            }

            public final boolean isSystemFallbackPickerAvailable$activity(Context context) {
                x.f(context, "context");
                return getSystemFallbackPicker$activity(context) != null;
            }

            public final boolean isSystemPickerAvailable$activity() {
                if (Build.VERSION.SDK_INT >= 33) {
                    return true;
                }
                return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }

            public final boolean isPhotoPickerAvailable() {
                return isSystemPickerAvailable$activity();
            }
        }

        /* compiled from: WazeSource */
        public abstract class DefaultTab {

            /* compiled from: WazeSource */
            public final class AlbumsTab extends DefaultTab {
                public static final AlbumsTab INSTANCE = new AlbumsTab();
                private static final int value = 0;

                private AlbumsTab() {
                    super(null);
                }

                @Override // androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab
                public int getValue() {
                    return value;
                }
            }

            /* compiled from: WazeSource */
            public final class PhotosTab extends DefaultTab {
                public static final PhotosTab INSTANCE = new PhotosTab();
                private static final int value = 1;

                private PhotosTab() {
                    super(null);
                }

                @Override // androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab
                public int getValue() {
                    return value;
                }
            }

            private DefaultTab() {
            }

            public abstract int getValue();

            public /* synthetic */ DefaultTab(o oVar) {
                this();
            }
        }

        public static final boolean isPhotoPickerAvailable(Context context) {
            return Companion.isPhotoPickerAvailable(context);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            getSynchronousResult2(context, pickVisualMediaRequest);
            return null;
        }
    }

    /* compiled from: WazeSource */
    public class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {
        public static final Companion Companion = new Companion(null);

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String str) {
            x.f(context, "context");
            x.f(str, "input");
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            x.e(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult2(Context context, String str) {
            x.f(context, "context");
            x.f(str, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            return intent != null ? Companion.getClipDataUris$activity(intent) : i.h();
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final List<Uri> getClipDataUris$activity(Intent intent) {
                x.f(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return i.h();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String str) {
            getSynchronousResult2(context, str);
            return null;
        }
    }

    /* compiled from: WazeSource */
    public class PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {
        public static final Companion Companion = new Companion(null);
        private final int maxItems;

        public PickMultipleVisualMedia(int i2) {
            this.maxItems = i2;
            if (i2 <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            PickVisualMedia.MediaCapabilities mediaCapabilitiesForTranscoding;
            x.f(context, "context");
            x.f(pickVisualMediaRequest, "input");
            if (PickVisualMedia.Companion.isSystemPickerAvailable$activity()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(PickVisualMedia.Companion.getVisualMimeType$activity(pickVisualMediaRequest.getMediaType()));
                int iMin = Math.min(this.maxItems, pickVisualMediaRequest.getMaxItems());
                if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                    throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", pickVisualMediaRequest.getDefaultTab().getValue());
                intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", pickVisualMediaRequest.isOrderedSelection());
                if (pickVisualMediaRequest.isCustomAccentColorApplied()) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", pickVisualMediaRequest.getAccentColor());
                }
                if (Build.VERSION.SDK_INT >= 33 && (mediaCapabilitiesForTranscoding = pickVisualMediaRequest.getMediaCapabilitiesForTranscoding()) != null) {
                    intent.putExtra("android.provider.extra.MEDIA_CAPABILITIES", mediaCapabilitiesForTranscoding.toApplicationMediaCapabilities$activity());
                }
                return intent;
            }
            if (!PickVisualMedia.Companion.isSystemFallbackPickerAvailable$activity(context)) {
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.setType(PickVisualMedia.Companion.getVisualMimeType$activity(pickVisualMediaRequest.getMediaType()));
                intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent2.getType() == null) {
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent2;
            }
            ResolveInfo systemFallbackPicker$activity = PickVisualMedia.Companion.getSystemFallbackPicker$activity(context);
            if (systemFallbackPicker$activity == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = systemFallbackPicker$activity.activityInfo;
            Intent intent3 = new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
            intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent3.setType(PickVisualMedia.Companion.getVisualMimeType$activity(pickVisualMediaRequest.getMediaType()));
            int iMin2 = Math.min(this.maxItems, pickVisualMediaRequest.getMaxItems());
            if (iMin2 <= 1) {
                throw new IllegalArgumentException("Max items must be greater than 1");
            }
            intent3.putExtra(PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX, iMin2);
            intent3.putExtra(PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_LAUNCH_TAB, pickVisualMediaRequest.getDefaultTab().getValue());
            intent3.putExtra(PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_IN_ORDER, pickVisualMediaRequest.isOrderedSelection());
            if (!pickVisualMediaRequest.isCustomAccentColorApplied()) {
                return intent3;
            }
            intent3.putExtra(PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_ACCENT_COLOR, pickVisualMediaRequest.getAccentColor());
            return intent3;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult2(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            x.f(context, "context");
            x.f(pickVisualMediaRequest, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            return intent != null ? GetMultipleContents.Companion.getClipDataUris$activity(intent) : i.h();
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final int getMaxItems$activity() {
                if (PickVisualMedia.Companion.isSystemPickerAvailable$activity()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            getSynchronousResult2(context, pickVisualMediaRequest);
            return null;
        }

        public PickMultipleVisualMedia() {
            this(0, 1, null);
        }

        public /* synthetic */ PickMultipleVisualMedia(int i2, int i3, o oVar) {
            this((i3 & 1) != 0 ? Companion.getMaxItems$activity() : i2);
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes.dex */
    public final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {
        public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String[] strArr) {
            x.f(context, "context");
            x.f(strArr, "input");
            return Companion.createIntent$activity(strArr);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
            x.f(context, "context");
            x.f(strArr, "input");
            if (strArr.length == 0) {
                return new ActivityResultContract.SynchronousResult<>(r.j());
            }
            for (String str : strArr) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(strArr.length), 16));
            for (String str2 : strArr) {
                k kVar = new k(str2, true);
                linkedHashMap.put(kVar.c(), kVar.d());
            }
            return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Map<String, Boolean> parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                return r.j();
            }
            if (intent == null) {
                return r.j();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
            int[] intArrayExtra = intent.getIntArrayExtra(EXTRA_PERMISSION_GRANT_RESULTS);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return r.j();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i3 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i3 == 0));
            }
            return r.q(i.ar(c.R(stringArrayExtra), arrayList));
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final Intent createIntent$activity(String[] strArr) {
                x.f(strArr, "input");
                Intent intentPutExtra = new Intent(RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS).putExtra(RequestMultiplePermissions.EXTRA_PERMISSIONS, strArr);
                x.e(intentPutExtra, "putExtra(...)");
                return intentPutExtra;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes.dex */
    public final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* renamed from: createIntent, reason: avoid collision after fix types in other method */
        public Intent createIntent2(Context context, Intent intent) {
            x.f(context, "context");
            x.f(intent, "input");
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ Intent createIntent(Context context, Intent intent) {
            Intent intent2 = intent;
            createIntent2(context, intent2);
            return intent2;
        }
    }

    /* compiled from: WazeSource */
    public final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        public static final String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            x.f(context, "context");
            x.f(intentSenderRequest, "input");
            Intent intentPutExtra = new Intent(ACTION_INTENT_SENDER_REQUEST).putExtra(EXTRA_INTENT_SENDER_REQUEST, intentSenderRequest);
            x.e(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    public class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Uri uri) {
            x.f(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult2(Context context, Uri uri) {
            x.f(context, "context");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, Uri uri) {
            getSynchronousResult2(context, uri);
            return null;
        }
    }

    /* compiled from: WazeSource */
    public class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Void r2) {
            x.f(context, "context");
            Intent intentAddFlags = new Intent("android.media.action.IMAGE_CAPTURE").addFlags(1).addFlags(2);
            x.e(intentAddFlags, "addFlags(...)");
            return intentAddFlags;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult2(Context context, Void r2) {
            x.f(context, "context");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Bitmap parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Void r2) {
            getSynchronousResult2(context, r2);
            return null;
        }
    }

    /* compiled from: WazeSource */
    public class CreateDocument extends ActivityResultContract<String, Uri> {
        private final String mimeType;

        public CreateDocument(String str) {
            x.f(str, "mimeType");
            this.mimeType = str;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String str) {
            x.f(context, "context");
            x.f(str, "input");
            Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.mimeType).putExtra("android.intent.extra.TITLE", str);
            x.e(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult2(Context context, String str) {
            x.f(context, "context");
            x.f(str, "input");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        public CreateDocument() {
            this("*/*");
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String str) {
            getSynchronousResult2(context, str);
            return null;
        }
    }

    /* compiled from: WazeSource */
    public class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Uri uri) {
            x.f(context, "context");
            x.f(uri, "input");
            Intent intentAddFlags = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri).addFlags(1).addFlags(2);
            x.e(intentAddFlags, "addFlags(...)");
            return intentAddFlags;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult2(Context context, Uri uri) {
            x.f(context, "context");
            x.f(uri, "input");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Boolean parseResult(int i2, Intent intent) {
            return Boolean.valueOf(i2 == -1);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri uri) {
            getSynchronousResult2(context, uri);
            return null;
        }
    }

    /* compiled from: WazeSource */
    public class GetContent extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String str) {
            x.f(context, "context");
            x.f(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            x.e(type, "setType(...)");
            return type;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult2(Context context, String str) {
            x.f(context, "context");
            x.f(str, "input");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String str) {
            getSynchronousResult2(context, str);
            return null;
        }
    }

    /* compiled from: WazeSource */
    public class OpenDocument extends ActivityResultContract<String[], Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String[] strArr) {
            x.f(context, "context");
            x.f(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            x.e(type, "setType(...)");
            return type;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult2(Context context, String[] strArr) {
            x.f(context, "context");
            x.f(strArr, "input");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String[] strArr) {
            getSynchronousResult2(context, strArr);
            return null;
        }
    }

    /* compiled from: WazeSource */
    public class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String[] strArr) {
            x.f(context, "context");
            x.f(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            x.e(type, "setType(...)");
            return type;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult2(Context context, String[] strArr) {
            x.f(context, "context");
            x.f(strArr, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            return intent != null ? GetMultipleContents.Companion.getClipDataUris$activity(intent) : i.h();
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String[] strArr) {
            getSynchronousResult2(context, strArr);
            return null;
        }
    }

    /* compiled from: WazeSource */
    public class TakePicture extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Uri uri) {
            x.f(context, "context");
            x.f(uri, "input");
            Intent intentAddFlags = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri).addFlags(1).addFlags(2);
            x.e(intentAddFlags, "addFlags(...)");
            return intentAddFlags;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult2(Context context, Uri uri) {
            x.f(context, "context");
            x.f(uri, "input");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Boolean parseResult(int i2, Intent intent) {
            return Boolean.valueOf(i2 == -1);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri uri) {
            getSynchronousResult2(context, uri);
            return null;
        }
    }

    /* compiled from: WazeSource */
    public class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Uri uri) {
            x.f(context, "context");
            x.f(uri, "input");
            Intent intentAddFlags = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri).addFlags(1).addFlags(2);
            x.e(intentAddFlags, "addFlags(...)");
            return intentAddFlags;
        }

        /* renamed from: getSynchronousResult, reason: avoid collision after fix types in other method */
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult2(Context context, Uri uri) {
            x.f(context, "context");
            x.f(uri, "input");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Bitmap parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Uri uri) {
            getSynchronousResult2(context, uri);
            return null;
        }
    }
}
