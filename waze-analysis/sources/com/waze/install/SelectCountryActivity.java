package com.waze.install;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.autofill.HintConstants;
import androidx.core.view.ViewCompat;
import com.waze.R;
import com.waze.settings.bl;
import com.waze.settings.gw;
import com.waze.view.title.TitleBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SelectCountryActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f24715f = {"US", "IT", "FR", "GB", "ES"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f24716g = {"AF", "AX", "AL", "DZ", "AS", "AD", "AO", "AI", "AQ", "AG", "AR", "AM", "AW", "AU", "AT", "AZ", "BS", "BH", "BD", "BB", "BY", "BE", "BZ", "BJ", "BM", "BT", "BO", "BQ", "BA", "BW", "BV", "BR", "IO", "BN", "BG", "BF", "BI", "KH", "CM", "CA", "CV", "KY", "CF", "TD", "CL", "CN", "CX", "CC", "CO", "KM", "CG", "CD", "CK", "CR", "CI", "HR", "CU", "CW", "CY", "CZ", "DK", "DJ", "DM", "DO", "EC", "EG", "SV", "GQ", "ER", "EE", "ET", "FK", "FO", "FJ", "FI", "FR", "GF", "PF", "TF", "GA", "GM", "GE", "DE", "GH", "GI", "GR", "GL", "GD", "GP", "GU", "GT", "GG", "GN", "GW", "GY", "HT", "HM", "VA", "HN", "HK", "HU", "IS", "IN", "ID", "IR", "IQ", "IE", "IM", "IL", "IT", "JM", "JP", "JE", "JO", "KZ", "KE", "KI", "KP", "KR", "KW", "KG", "LA", "LV", "LB", "LS", "LR", "LY", "LI", "LT", "LU", "MO", "MK", "MG", "MW", "MY", "MV", "ML", "MT", "MH", "MQ", "MR", "MU", "YT", "MX", "FM", "MD", "MC", "MN", "ME", "MS", "MA", "MZ", "MM", "NA", "NR", "NP", "NL", "NC", "NZ", "NI", "NE", "NG", "NU", "NF", "MP", "NO", "OM", "PK", "PW", "PS", "PA", "PG", "PY", "PE", "PH", "PN", "PL", "PT", "PR", "QA", "RE", "RO", "RU", "RW", "BL", "SH", "KN", "LC", "MF", "PM", "VC", "WS", "SM", "ST", "SA", "SN", "RS", "SC", "SL", "SG", "SX", "SK", "SI", "SB", "SO", "ZA", "GS", "SS", "ES", "LK", "SD", "SR", "SJ", "SZ", "SE", "CH", "SY", "TW", "TJ", "TZ", "TH", "TL", "TG", "TK", "TO", "TT", "TN", "TR", "TM", "TC", "TV", "UG", "UA", "AE", "GB", "US", "UM", "UY", "UZ", "VU", "VE", "VN", "VG", "VI", "WF", "EH", "YE", "ZM", "ZW"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f24717h = {"Afghanistan", "Aland Islands", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia, Plurinational State of", "Bonaire, Sint Eustatius and Saba", "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Curaçao", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard Island and McDonald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran, Islamic Republic of", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macao", "Macedonia, the former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Palestinian territories", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Barthelemy", "Saint Helena, Ascension and Tristan da Cunha", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin (French part)", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Sint Maarten (Dutch part)", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Timor-Leste", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela, Bolivarian Republic of", "Viet Nam", "Virgin Islands, British", "Virgin Islands, U.S.", "Wallis and Futuna", "Western Sahara", "Yemen", "Zambia", "Zimbabwe"};

    /* renamed from: k, reason: collision with root package name */
    private gw[] f24718k;

    public static /* synthetic */ void l(SelectCountryActivity selectCountryActivity, int i2) {
        ((InstallNativeManager) com.waze.web.r.h(InstallNativeManager.class)).setCountry(selectCountryActivity.f24718k[i2].f37349b);
        selectCountryActivity.setResult(-1);
        selectCountryActivity.finish();
    }

    private static final void m(List list, Set set, Map map, String str) {
        if (set.contains(str)) {
            return;
        }
        list.add((gw) map.get(str));
        set.add(str);
    }

    @Override // com.waze.ifs.ui.a
    protected final int bq() {
        return 1;
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == -1) {
            setResult(-1);
            finish();
            i3 = -1;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String[] strArr;
        super.onCreate(bundle);
        aE();
        String networkCountryIso = ((TelephonyManager) getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkCountryIso();
        if (networkCountryIso != null && networkCountryIso.length() > 0) {
            networkCountryIso = networkCountryIso.toUpperCase();
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        int i2 = 0;
        while (true) {
            strArr = f24717h;
            int length = strArr.length;
            if (i2 >= 249) {
                break;
            }
            String str = f24716g[i2];
            map.put(str, new gw(str, strArr[i2], false));
            i2++;
        }
        if (networkCountryIso != null && networkCountryIso.length() > 0) {
            m(arrayList, hashSet, map, networkCountryIso);
        }
        String[] strArr2 = f24715f;
        int length2 = strArr2.length;
        for (int i3 = 0; i3 < 5; i3++) {
            m(arrayList, hashSet, map, strArr2[i3]);
        }
        int i4 = 0;
        while (true) {
            int length3 = strArr.length;
            if (i4 >= 249) {
                this.f24718k = (gw[]) arrayList.toArray(new gw[arrayList.size()]);
                setContentView(R.layout.settings_values);
                TitleBar titleBar = (TitleBar) findViewById(R.id.theTitleBar);
                titleBar.e(com.waze.shared_infra.o.b.a().c(R.string.SELECT_COUNTRY, new Object[0]), false);
                titleBar.r();
                titleBar.n(new com.waze.design_components.c.e(this, 19));
                titleBar.m(new com.waze.design_components.c.e(this, 20));
                bl blVar = new bl();
                ListView listView = (ListView) findViewById(R.id.settingsValueList);
                listView.setAdapter((ListAdapter) blVar);
                listView.setOnItemClickListener(new com.waze.navigate.ah(this, 1));
                blVar.a(this.f24718k);
                listView.invalidateViews();
                getOnBackPressedDispatcher().addCallback(new au(this));
                ViewCompat.setOnApplyWindowInsetsListener(listView, new av(this, listView));
                return;
            }
            m(arrayList, hashSet, map, f24716g[i4]);
            i4++;
        }
    }
}
