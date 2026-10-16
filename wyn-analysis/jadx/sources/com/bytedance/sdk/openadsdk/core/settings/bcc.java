package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.tpx;
import com.bytedance.sdk.openadsdk.core.settings.zjm;
import com.bytedance.sdk.openadsdk.core.sy;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class bcc extends zjm {
    static final ArrayList<String> moa = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", "de", "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    private Set<String> lw;
    public boolean yo;

    public bcc(zjm.uef uefVar) {
        super(uefVar);
        this.lw = DesugarCollections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.zjm
    public String uef() {
        try {
            if (sy.uef() == null || tpx.uef(sy.uef())) {
                return "tt_sdk_settings_sr.prop";
            }
            return "tt_sdk_settings_sr_" + tpx.yo(sy.uef()) + ".prop";
        } catch (Throwable unused) {
            return "tt_sdk_settings_sr";
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(88:0|2|(1:8)(86:5|(1:7)|10|(1:12)(1:13)|14|(3:16|(1:20)|21)|22|(1:24)|25|(3:27|(1:31)|32)|33|(4:35|(1:37)(1:38)|39|(1:41))(1:42)|43|(1:45)|46|(4:48|(1:50)|51|(1:53))(1:54)|55|(1:59)|60|(1:62)|63|(1:65)|66|(1:68)|69|(1:71)|72|(1:74)|75|(1:77)|78|(1:80)|81|(1:83)|84|(1:86)|87|(1:89)|90|(1:92)|93|(1:95)|96|(1:98)|99|(1:101)|102|(16:104|(2:106|(1:110))|111|(1:113)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:125)|126|(1:128)|129|(4:360|131|(3:135|(2:138|136)|366)|141))|142|144|(1:146)|147|(14:149|(1:151)(1:152)|153|(1:155)|156|(1:158)|159|(1:161)|162|(1:164)|165|(2:167|(1:169)(1:170))|171|(4:173|(2:175|(1:179))(1:180)|(1:182)(1:183)|184))|185|(1:187)|188|(3:190|(1:194)|195)|196|(3:198|(1:202)|203)|204|(1:206)|207|(1:209)|210|(1:212)|213|(1:215)|216|(26:218|(1:220)|221|(1:223)|224|(1:226)|227|(1:229)|230|(1:232)|233|(1:235)|236|(1:238)|239|(1:241)|242|(1:244)|245|(1:247)|248|(1:250)|251|(1:253)|254|(3:256|(1:258)|259))|260|(3:364|262|(36:264|(2:266|(1:268))|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:291)|292|(2:294|(1:296))|297|(1:299)|300|(1:302)|303|(1:305)|306|(1:308)|309|(1:311)|312|(1:314)|315|(1:317)|318|(1:320)|321|(1:323)|324|(1:326)))|329|362|330|334|(1:336)|337|(1:339)|340|(2:342|(1:344)(1:345))|346|(2:348|(1:350)(1:351))|352|(2:354|(1:356)(1:357))|358|359)|9|10|(0)(0)|14|(0)|22|(0)|25|(0)|33|(0)(0)|43|(0)|46|(0)(0)|55|(2:57|59)|60|(0)|63|(0)|66|(0)|69|(0)|72|(0)|75|(0)|78|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|(0)|102|(0)|142|144|(0)|147|(0)|185|(0)|188|(0)|196|(0)|204|(0)|207|(0)|210|(0)|213|(0)|216|(0)|260|(0)|329|362|330|334|(0)|337|(0)|340|(0)|346|(0)|352|(0)|358|359) */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0734, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0735, code lost:
    
        com.bytedance.sdk.component.utils.dhk.yo("SettingsDefaultRepository", "coreSettingJson", r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x059a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0232  */
    @Override // com.bytedance.sdk.openadsdk.core.settings.lw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(org.json.JSONObject r34) {
        /*
            Method dump skipped, instructions count: 2002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.bcc.uef(org.json.JSONObject):void");
    }

    public static Set<String> uef(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
