package com.waze;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.waze.config.ConfigValues;
import com.waze.resources.ResourcesNativeManager;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class MoodManager extends gh implements com.waze.aw.a {
    private static MoodManager sInstance;
    private Integer mAddonIndex;
    private Mood[] mCustomMoods;
    private Mood[] mDefaultMoods;
    private int mNewbieMilage;
    private static final String ADDON_CROWN = "crown";
    private static final String ADDON_SWORD = "sword";
    private static final String ADDON_SHIELD = "shield";
    private static final String ADDON_EDIT = "edit";
    private static final String ADDON_BETA = "beta";
    private static final String ADDON_HALO = "halo";
    private static final String ADDON_WINGS = "wings";
    private static final String[] addonsList = {ADDON_CROWN, ADDON_SWORD, ADDON_SHIELD, ADDON_EDIT, ADDON_BETA, ADDON_HALO, ADDON_WINGS};
    private final com.waze.shared_infra.s.e<String> wazerMoodObservable = new com.waze.shared_infra.s.e<>(null);
    private int mExclusiveMoodLevel = -1;
    private boolean mBaby = true;
    private String mNewbieMilageUnit = "";
    private final SparseArray<Mood> mMoodById = new SparseArray<>();

    /* compiled from: WazeSource */
    public class Mood {
        boolean is_special;
        public String name;
        public int type;
    }

    public static Drawable getBigMoodDrawble(Context context, String str) {
        int drawableIdForMood = getDrawableIdForMood(str);
        return drawableIdForMood > 0 ? ContextCompat.getDrawable(context, drawableIdForMood) : getMoodDrawable(str);
    }

    private native Mood[] getCustomMoodListNTV(boolean z, boolean z2);

    private native Mood[] getDefaultMoodListNTV(boolean z, boolean z2);

    private static int getDrawableIdForMood(String str) {
        String lowerCase = str.replace("-", "_").toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -2083958873:
                if (lowerCase.equals("sunflower")) {
                    return R.drawable.sunflower;
                }
                return 0;
            case -1582055608:
                if (lowerCase.equals("wazer_robot")) {
                    return R.drawable.wazer_robot;
                }
                return 0;
            case -1415179152:
                if (lowerCase.equals("albert")) {
                    return R.drawable.albert;
                }
                return 0;
            case -1183991273:
                if (lowerCase.equals("inlove")) {
                    return R.drawable.inlove;
                }
                return 0;
            case -899765118:
                if (lowerCase.equals("sleepy")) {
                    return R.drawable.sleepy;
                }
                return 0;
            case -896071406:
                if (lowerCase.equals("speedy")) {
                    return R.drawable.speedy;
                }
                return 0;
            case -696355290:
                if (lowerCase.equals("zombie")) {
                    return R.drawable.zombie;
                }
                return 0;
            case -468416201:
                if (lowerCase.equals("wazer_8bit")) {
                    return R.drawable.wazer_8bit;
                }
                return 0;
            case -467166152:
                if (lowerCase.equals("wazer_baby")) {
                    return R.drawable.wazer_baby;
                }
                return 0;
            case -467098520:
                if (lowerCase.equals("wazer_dino")) {
                    return R.drawable.wazer_dino;
                }
                return 0;
            case -68362952:
                if (lowerCase.equals("wazer_monster")) {
                    return R.drawable.wazer_monster;
                }
                return 0;
            case -58612657:
                if (lowerCase.equals("peaceful")) {
                    return R.drawable.peaceful;
                }
                return 0;
            case 107337:
                if (lowerCase.equals("lol")) {
                    return R.drawable.lol;
                }
                return 0;
            case 113622:
                if (lowerCase.equals("sad")) {
                    return R.drawable.sad;
                }
                return 0;
            case 113860:
                if (lowerCase.equals("shy")) {
                    return R.drawable.shy;
                }
                return 0;
            case 3059529:
                if (lowerCase.equals("cool")) {
                    return R.drawable.cool;
                }
                return 0;
            case 3168772:
                if (lowerCase.equals("geek")) {
                    return R.drawable.geek;
                }
                return 0;
            case 3530046:
                if (lowerCase.equals("sick")) {
                    return R.drawable.sick;
                }
                return 0;
            case 99047136:
                if (lowerCase.equals("happy")) {
                    return R.drawable.happy;
                }
                return 0;
            case 104824458:
                if (lowerCase.equals("ninja")) {
                    return R.drawable.ninja;
                }
                return 0;
            case 106940924:
                if (lowerCase.equals("proud")) {
                    return R.drawable.proud;
                }
                return 0;
            case 849316117:
                if (lowerCase.equals("bugbuster")) {
                    return R.drawable.bugbuster;
                }
                return 0;
            case 873657725:
                if (lowerCase.equals("sarcastic")) {
                    return R.drawable.sarcastic;
                }
                return 0;
            case 1702434938:
                if (lowerCase.equals("frustrated")) {
                    return R.drawable.frustrated;
                }
                return 0;
            case 1712592452:
                if (lowerCase.equals("biker_dark")) {
                    return R.drawable.biker_dark;
                }
                return 0;
            default:
                return 0;
        }
    }

    private native int getExclusiveMoodLevelNTV();

    public static synchronized MoodManager getInstance() {
        MoodManager moodManager;
        moodManager = sInstance;
        if (moodManager == null) {
            moodManager = new MoodManager();
            sInstance = moodManager;
        }
        return moodManager;
    }

    private native int getMoodAddonNTV();

    public static Drawable getMoodDrawable(String str) {
        Resources resources = mg.a().getResources();
        Drawable skinDrawable = ResourcesNativeManager.getInstance().getSkinDrawable(resources, "moods/" + str + ".png");
        if (skinDrawable != null) {
            return skinDrawable;
        }
        return ResourcesNativeManager.getInstance().getSkinDrawable(resources, String.valueOf(str).concat(".png"));
    }

    private native String getMoodNTV();

    public static String getMoodResourceName(String str) {
        return String.format("moods/%s", str);
    }

    private native int getNewbieMilageNTV();

    private native String getNewbieMilageUnitNTV();

    public static Drawable getUpScaledMoodDrawable(Context context, String str) {
        return getUpScaledMoodDrawableStatic(context, str);
    }

    private static Drawable getUpScaledMoodDrawableStatic(Context context, String str) {
        Drawable moodDrawable = getMoodDrawable(String.valueOf(str).concat("_ui"));
        return moodDrawable != null ? moodDrawable : getBigMoodDrawble(context, str);
    }

    private native boolean isBabyNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshMood$0(boolean z, int i2, int i3, int i4, String str, String str2) {
        this.mBaby = z;
        this.mAddonIndex = Integer.valueOf(i2);
        this.mExclusiveMoodLevel = i3;
        this.mNewbieMilage = i4;
        this.mNewbieMilageUnit = str;
        this.wazerMoodObservable.c(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshMoodsList$0(Mood[] moodArr, Mood[] moodArr2) {
        this.mDefaultMoods = moodArr;
        this.mCustomMoods = moodArr2;
        this.mMoodById.clear();
        for (Mood mood : this.mDefaultMoods) {
            this.mMoodById.put(mood.type, mood);
        }
        for (Mood mood2 : this.mCustomMoods) {
            this.mMoodById.put(mood2.type, mood2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setMoodNTV, reason: merged with bridge method [inline-methods] */
    public native void lambda$setWazerMood$0(String str, boolean z, boolean z2);

    public static void setTestInstance(MoodManager moodManager) {
        sInstance = moodManager;
    }

    native void InitMoodManagerNTV();

    public boolean canSetMood(Context context, String str) {
        int i2;
        int i3;
        if (isBaby()) {
            return str.equals(context.getResources().getString(R.string.babyMood));
        }
        int i4 = this.mExclusiveMoodLevel;
        if (i4 < 0) {
            com.waze.shared_infra.i.h.j("Check exclusive mode before initializing");
            this.mExclusiveMoodLevel = 0;
            i2 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            i2 = i4;
            i3 = i2;
        }
        if ("wazer_dino".equals(str)) {
            return i4 >= 3;
        }
        if ("wazer_8bit".equals(str)) {
            return i2 >= 2;
        }
        if ("wazer_robot".equals(str)) {
            return i3 > 0;
        }
        if (Arrays.asList(context.getResources().getStringArray(R.array.mood_list_beta)).contains(str)) {
            return ConfigManager.getInstance().getConfigValueBool(ConfigValues.CONFIG_VALUE_MOODS_BETA_ENABLED);
        }
        return true;
    }

    public Mood[] getCustomMoodsList() {
        return this.mCustomMoods;
    }

    public Mood[] getDefaultMoodsList() {
        return this.mDefaultMoods;
    }

    public Drawable getMoodDrawableById(int i2) {
        return getMoodDrawable(getMoodNameById(i2));
    }

    @Override // com.waze.aw.a
    public String getMoodNameById(int i2) {
        String str;
        Mood mood = this.mMoodById.get(i2);
        return (mood == null || (str = mood.name) == null) ? "happy" : str;
    }

    public String getNewbieMessage(int i2) {
        return com.waze.shared_infra.o.b.a().c(i2, Integer.valueOf(this.mNewbieMilage), this.mNewbieMilageUnit);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Drawable getUpScaledAddonDrawable(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.Integer r0 = r5.mAddonIndex
            if (r0 == 0) goto L93
            int r0 = r0.intValue()
            if (r0 < 0) goto L93
            java.lang.Integer r0 = r5.mAddonIndex
            int r0 = r0.intValue()
            java.lang.String[] r1 = com.waze.MoodManager.addonsList
            int r2 = r1.length
            if (r0 < r2) goto L17
            goto L93
        L17:
            android.content.Context r0 = com.waze.mg.a()
            android.content.res.Resources r0 = r0.getResources()
            com.waze.resources.ResourcesNativeManager r2 = com.waze.resources.ResourcesNativeManager.getInstance()
            java.lang.Integer r3 = r5.mAddonIndex
            int r3 = r3.intValue()
            r3 = r1[r3]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "_ui.png"
            java.lang.String r3 = r3.concat(r4)
            android.graphics.drawable.Drawable r0 = r2.getSkinDrawable(r0, r3)
            if (r0 == 0) goto L3c
            return r0
        L3c:
            java.lang.Integer r5 = r5.mAddonIndex
            int r5 = r5.intValue()
            r5 = r1[r5]
            int r0 = r5.hashCode()
            switch(r0) {
                case -903340183: goto L7e;
                case 3108362: goto L72;
                case 94935223: goto L66;
                case 109860349: goto L59;
                case 113136072: goto L4c;
                default: goto L4b;
            }
        L4b:
            goto L8b
        L4c:
            java.lang.String r0 = "wings"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L8b
            r5 = 2131233353(0x7f080a49, float:1.8082841E38)
            goto L8c
        L59:
            java.lang.String r0 = "sword"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L8b
            r5 = 2131233110(0x7f080956, float:1.8082348E38)
            goto L8c
        L66:
            java.lang.String r0 = "crown"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L8b
            r5 = 2131231370(0x7f08028a, float:1.807882E38)
            goto L8c
        L72:
            java.lang.String r0 = "edit"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L8b
            r5 = 2131231428(0x7f0802c4, float:1.8078937E38)
            goto L8c
        L7e:
            java.lang.String r0 = "shield"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L8b
            r5 = 2131232965(0x7f0808c5, float:1.8082054E38)
            goto L8c
        L8b:
            r5 = 0
        L8c:
            if (r5 <= 0) goto L93
            android.graphics.drawable.Drawable r5 = androidx.core.content.ContextCompat.getDrawable(r6, r5)
            return r5
        L93:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.MoodManager.getUpScaledAddonDrawable(android.content.Context):android.graphics.drawable.Drawable");
    }

    public Drawable getUpScaledMoodDrawableSync(Context context, String str) {
        return getUpScaledMoodDrawableStatic(context, str);
    }

    public String getWazerMood() {
        String str = (String) this.wazerMoodObservable.a();
        if (str != null) {
            return str;
        }
        com.waze.shared_infra.i.h.j("Get wazer mood before initializing");
        return "wazer_baby";
    }

    public com.waze.shared_infra.s.f<String> getWazerMoodObservable() {
        return this.wazerMoodObservable;
    }

    public boolean isBaby() {
        return this.mBaby;
    }

    protected native boolean isMoodInConfigNTV(String str);

    public boolean isValidMoodId(int i2) {
        Mood mood = this.mMoodById.get(i2);
        return (mood == null || mood.name == null) ? false : true;
    }

    protected native void marketplaceMoodRestorePreviousNTV(boolean z);

    void refreshMood() {
        final String moodNTV = getMoodNTV();
        final boolean zIsBabyNTV = isBabyNTV();
        final int moodAddonNTV = getMoodAddonNTV();
        final int exclusiveMoodLevelNTV = getExclusiveMoodLevelNTV();
        final int newbieMilageNTV = getNewbieMilageNTV();
        final String newbieMilageUnitNTV = getNewbieMilageUnitNTV();
        t.l(new Runnable() { // from class: com.waze.gf
            @Override // java.lang.Runnable
            public final void run() {
                this.f24033a.lambda$refreshMood$0(zIsBabyNTV, moodAddonNTV, exclusiveMoodLevelNTV, newbieMilageNTV, newbieMilageUnitNTV, moodNTV);
            }
        });
    }

    public void refreshMoodPublic() {
        refreshMood();
    }

    void refreshMoodsList() {
        t.l(new android.support.v4.app.n(this, getDefaultMoodListNTV(false, true), getCustomMoodListNTV(false, false), 10, (char[]) null));
    }

    protected native void setMarketplaceMoodProtoNTV(byte[] bArr);

    public void setWazerMood(final String str, final boolean z, final boolean z2) {
        if (getWazerMood().equals(str)) {
            return;
        }
        this.wazerMoodObservable.c(str);
        NativeManager.Post(new Runnable() { // from class: com.waze.ge
            @Override // java.lang.Runnable
            public final void run() {
                this.f24029a.lambda$setWazerMood$0(str, z, z2);
            }
        });
    }
}
