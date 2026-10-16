package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.car.RadioMetadata;
import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.gms.car.RadioProgramSelector;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes2.dex */
public class mit {
    final Resources a;
    private final Random b;

    public mit(Resources resources, Random random) {
        this.a = resources;
        this.b = random;
    }

    public static Uri a(int i, String str) {
        return lej.a().e() ? s().appendPath(str.concat("_hero_connect")).build() : s().appendPath(String.format(Locale.US, "%s_%02d", str, Integer.valueOf(i))).build();
    }

    static String g(RadioProgramInfo radioProgramInfo) {
        RadioMetadata radioMetadata = radioProgramInfo.b;
        if (radioMetadata == null) {
            return null;
        }
        String str = radioMetadata.g;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    static String i(RadioProgramInfo radioProgramInfo) {
        RadioMetadata.RadioSongMetadata radioSongMetadata;
        RadioMetadata radioMetadata = radioProgramInfo.b;
        if (radioMetadata == null || (radioSongMetadata = radioMetadata.f) == null) {
            return null;
        }
        String str = radioSongMetadata.c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    static String j(RadioProgramInfo radioProgramInfo) {
        RadioMetadata.RadioSongMetadata radioSongMetadata;
        RadioMetadata radioMetadata = radioProgramInfo.b;
        if (radioMetadata == null || (radioSongMetadata = radioMetadata.f) == null) {
            return null;
        }
        String str = radioSongMetadata.b;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    static String k(RadioProgramInfo radioProgramInfo) {
        RadioMetadata.RadioSongMetadata radioSongMetadata;
        RadioMetadata radioMetadata = radioProgramInfo.b;
        if (radioMetadata == null || (radioSongMetadata = radioMetadata.f) == null) {
            return null;
        }
        String str = radioSongMetadata.d;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    static String l(RadioProgramInfo radioProgramInfo) {
        RadioMetadata.RadioSongMetadata radioSongMetadata;
        RadioMetadata radioMetadata = radioProgramInfo.b;
        if (radioMetadata == null || (radioSongMetadata = radioMetadata.f) == null) {
            return null;
        }
        String str = radioSongMetadata.a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    static String m(RadioProgramInfo radioProgramInfo) {
        RadioMetadata radioMetadata = radioProgramInfo.b;
        if (radioMetadata == null) {
            return null;
        }
        String str = radioMetadata.c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    static final String n(yfq yfqVar) {
        return new xxd(" · ").b(yfqVar);
    }

    static final yfq o(RadioProgramInfo radioProgramInfo, yfq yfqVar) {
        Stream streamFilter = Collection.EL.stream(yfqVar).map(new lpc(radioProgramInfo, 10)).filter(new lye(8));
        int i = yfq.d;
        return (yfq) streamFilter.collect(ycm.a);
    }

    static final String p(RadioProgramInfo radioProgramInfo, yfq yfqVar) {
        int i = 0;
        while (i < ((yls) yfqVar).c) {
            String str = (String) lk$$ExternalSyntheticApiModelOutline0.m352m((Object) yfqVar.get(i)).apply(radioProgramInfo);
            i++;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return null;
    }

    static final Optional q(RadioProgramInfo radioProgramInfo) {
        Optional optionalG = lws.g(radioProgramInfo.a, 3);
        return true != optionalG.isPresent() ? optionalG : Optional.ofNullable(Integer.valueOf(lws.e(((Long) optionalG.get()).longValue()) + 1));
    }

    public static void r(kmu kmuVar, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        kmuVar.h(str, str2);
    }

    private static Uri.Builder s() {
        return new Uri.Builder().scheme("android.resource").authority("com.google.android.projection.gearhead").appendPath("drawable");
    }

    public final Uri b(RadioProgramSelector radioProgramSelector, String str) {
        Optional optionalF = lws.f(radioProgramSelector);
        miq miqVar = new miq(radioProgramSelector, 3);
        if (true == optionalF.isPresent()) {
            Object obj = optionalF.get();
            Object obj2 = miqVar.a;
            optionalF = Optional.ofNullable(Long.valueOf(((Long) obj).longValue() + (lws.l(((RadioProgramSelector) obj2).a.a) ? lws.e(r0.b) : 0)));
        }
        Random random = this.b;
        random.setSeed(((Long) optionalF.orElse(Long.valueOf(radioProgramSelector.a.hashCode()))).longValue());
        return a(random.nextInt(8), str);
    }

    public final String c(int i) {
        return this.a.getString(R.string.radio_hd_subchannel, Integer.valueOf(i));
    }

    public final String d(RadioProgramInfo radioProgramInfo) {
        int i = radioProgramInfo.a.a.a;
        int i2 = 18;
        int i3 = 16;
        return p(radioProgramInfo, lws.j(i) ? yfq.t(new lyd(i3), new lyd(17), new lyd(i2), new lpc(this, 11)) : lws.l(i) ? yfq.t(new lyd(19), new lyd(i3), new lyd(20), new lyd(i2)) : yfq.r(new lyd(i2), new lyd(i3)));
    }

    public final String e(RadioProgramInfo radioProgramInfo) {
        RadioProgramSelector radioProgramSelector = radioProgramInfo.a;
        Optional optionalF = lws.f(radioProgramSelector);
        mjs mjsVar = new mjs(radioProgramSelector, this.a, 1);
        if (true == optionalF.isPresent()) {
            Object obj = optionalF.get();
            Object obj2 = mjsVar.b;
            Object obj3 = mjsVar.a;
            Long l = (Long) obj;
            optionalF = lws.j(((RadioProgramSelector) obj2).a.a) ? Optional.of(String.format(Locale.US, ((Resources) obj3).getString(R.string.radio_dab_frequency), Float.valueOf(l.longValue() / 1000.0f))) : lws.i(l.longValue()) ? Optional.of(String.format(Locale.US, ((Resources) obj3).getString(R.string.radio_am_frequency), l)) : lws.k(l.longValue()) ? Optional.of(String.format(Locale.US, ((Resources) obj3).getString(R.string.radio_fm_frequency), Float.valueOf(l.longValue() / 1000.0f))) : Optional.empty();
        }
        return (String) optionalF.orElse(null);
    }

    public final String f(RadioProgramInfo radioProgramInfo) {
        Optional optionalQ = q(radioProgramInfo);
        miq miqVar = new miq(this, 2);
        if (true == optionalQ.isPresent()) {
            Object obj = optionalQ.get();
            optionalQ = Optional.ofNullable(((mit) miqVar.a).c(((Integer) obj).intValue()));
        }
        return (String) optionalQ.orElse(null);
    }

    public final String h(RadioProgramInfo radioProgramInfo) throws Resources.NotFoundException {
        RadioMetadata.RadioProgramType radioProgramType;
        String string;
        String string2;
        RadioMetadata radioMetadata = radioProgramInfo.b;
        if (radioMetadata != null && (radioProgramType = radioMetadata.d) != null) {
            int i = radioProgramType.a;
            if (i == 1) {
                switch (radioProgramType.b) {
                    case 1:
                        string2 = this.a.getString(R.string.radio_pty_news);
                        break;
                    case 2:
                        string2 = this.a.getString(R.string.radio_pty_current_affairs);
                        break;
                    case 3:
                        string2 = this.a.getString(R.string.radio_pty_information);
                        break;
                    case 4:
                        string2 = this.a.getString(R.string.radio_pty_sport);
                        break;
                    case 5:
                        string2 = this.a.getString(R.string.radio_pty_education);
                        break;
                    case 6:
                        string2 = this.a.getString(R.string.radio_pty_drama);
                        break;
                    case 7:
                        string2 = this.a.getString(R.string.radio_pty_culture);
                        break;
                    case 8:
                        string2 = this.a.getString(R.string.radio_pty_science);
                        break;
                    case 9:
                        string2 = this.a.getString(R.string.radio_pty_varied);
                        break;
                    case 10:
                        string2 = this.a.getString(R.string.radio_pty_pop_music);
                        break;
                    case 11:
                        string2 = this.a.getString(R.string.radio_pty_rock_music);
                        break;
                    case 12:
                        string2 = this.a.getString(R.string.radio_pty_easy_listening);
                        break;
                    case 13:
                        string2 = this.a.getString(R.string.radio_pty_light_classical);
                        break;
                    case 14:
                        string2 = this.a.getString(R.string.radio_pty_serious_classical);
                        break;
                    case 15:
                        string2 = this.a.getString(R.string.radio_pty_other_music);
                        break;
                    case 16:
                        string2 = this.a.getString(R.string.radio_pty_weather);
                        break;
                    case 17:
                        string2 = this.a.getString(R.string.radio_pty_finance);
                        break;
                    case 18:
                        string2 = this.a.getString(R.string.radio_pty_childrens_programmes);
                        break;
                    case 19:
                        string2 = this.a.getString(R.string.radio_pty_social_affairs);
                        break;
                    case 20:
                        string2 = this.a.getString(R.string.radio_pty_religion);
                        break;
                    case 21:
                        string2 = this.a.getString(R.string.radio_pty_phone_in);
                        break;
                    case 22:
                        string2 = this.a.getString(R.string.radio_pty_travel);
                        break;
                    case 23:
                        string2 = this.a.getString(R.string.radio_pty_leisure);
                        break;
                    case 24:
                        string2 = this.a.getString(R.string.radio_pty_jazz_music);
                        break;
                    case 25:
                        string2 = this.a.getString(R.string.radio_pty_country_music);
                        break;
                    case 26:
                        string2 = this.a.getString(R.string.radio_pty_national_music);
                        break;
                    case 27:
                        string2 = this.a.getString(R.string.radio_pty_oldies_music);
                        break;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        string2 = this.a.getString(R.string.radio_pty_folk_music);
                        break;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        string2 = this.a.getString(R.string.radio_pty_documentary);
                        break;
                    case 30:
                        string2 = this.a.getString(R.string.radio_pty_alarm_test);
                        break;
                    case 31:
                        string2 = this.a.getString(R.string.radio_pty_alarm);
                        break;
                    default:
                        string2 = null;
                        break;
                }
                if (!TextUtils.isEmpty(string2)) {
                    return string2;
                }
            } else if (i == 2) {
                switch (radioProgramType.b) {
                    case 1:
                        string = this.a.getString(R.string.radio_pty_news);
                        break;
                    case 2:
                        string = this.a.getString(R.string.radio_pty_information);
                        break;
                    case 3:
                        string = this.a.getString(R.string.radio_pty_sports);
                        break;
                    case 4:
                        string = this.a.getString(R.string.radio_pty_talk);
                        break;
                    case 5:
                        string = this.a.getString(R.string.radio_pty_rock);
                        break;
                    case 6:
                        string = this.a.getString(R.string.radio_pty_classic_rock);
                        break;
                    case 7:
                        string = this.a.getString(R.string.radio_pty_adult_hits);
                        break;
                    case 8:
                        string = this.a.getString(R.string.radio_pty_soft_rock);
                        break;
                    case 9:
                        string = this.a.getString(R.string.radio_pty_top_40);
                        break;
                    case 10:
                        string = this.a.getString(R.string.radio_pty_country);
                        break;
                    case 11:
                        string = this.a.getString(R.string.radio_pty_oldies);
                        break;
                    case 12:
                        string = this.a.getString(R.string.radio_pty_soft_music);
                        break;
                    case 13:
                        string = this.a.getString(R.string.radio_pty_nostalgia);
                        break;
                    case 14:
                        string = this.a.getString(R.string.radio_pty_jazz);
                        break;
                    case 15:
                        string = this.a.getString(R.string.radio_pty_classical);
                        break;
                    case 16:
                        string = this.a.getString(R.string.radio_pty_rhythm_and_blues);
                        break;
                    case 17:
                        string = this.a.getString(R.string.radio_pty_soft_rhythm_and_blues);
                        break;
                    case 18:
                        string = this.a.getString(R.string.radio_pty_language);
                        break;
                    case 19:
                        string = this.a.getString(R.string.radio_pty_religious_music);
                        break;
                    case 20:
                        string = this.a.getString(R.string.radio_pty_religious_talk);
                        break;
                    case 21:
                        string = this.a.getString(R.string.radio_pty_personality);
                        break;
                    case 22:
                        string = this.a.getString(R.string.radio_pty_public);
                        break;
                    case 23:
                        string = this.a.getString(R.string.radio_pty_college);
                        break;
                    case 24:
                        string = this.a.getString(R.string.radio_pty_spanish_talk);
                        break;
                    case 25:
                        string = this.a.getString(R.string.radio_pty_spanish_music);
                        break;
                    case 26:
                        string = this.a.getString(R.string.radio_pty_hip_hop);
                        break;
                    case 27:
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    default:
                        string = null;
                        break;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        string = this.a.getString(R.string.radio_pty_weather);
                        break;
                    case 30:
                        string = this.a.getString(R.string.radio_pty_emergency_test);
                        break;
                    case 31:
                        string = this.a.getString(R.string.radio_pty_emergency);
                        break;
                }
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
            }
        }
        return null;
    }
}
