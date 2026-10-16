package com.google.android.apps.auto.components.settings.backup;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.auto.components.settings.backup.SettingsBackupAgent;
import defpackage.acwi;
import defpackage.ebf;
import defpackage.rrc;
import defpackage.tlf;
import defpackage.tlg;
import defpackage.yfu;
import defpackage.yfy;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public class SettingsBackupAgent extends tlg {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.SettingsBackupAgent");

    @Override // defpackage.tlg
    protected final SharedPreferences a(String str) {
        return getSharedPreferences(str, 0);
    }

    @Override // defpackage.tlg
    public final Map b() {
        final int i = 1;
        tlf tlfVar = new tlf() { // from class: mkr
            @Override // defpackage.tlf
            public final boolean a(String str) {
                int i2 = i;
                if (i2 == 0) {
                    int i3 = SettingsBackupAgent.a;
                    return acwi.d().b.contains(str);
                }
                if (i2 != 1) {
                    return true;
                }
                int i4 = SettingsBackupAgent.a;
                return acwi.c().b.contains(str);
            }
        };
        final int i2 = 0;
        tlf tlfVar2 = new tlf() { // from class: mkr
            @Override // defpackage.tlf
            public final boolean a(String str) {
                int i22 = i2;
                if (i22 == 0) {
                    int i3 = SettingsBackupAgent.a;
                    return acwi.d().b.contains(str);
                }
                if (i22 != 1) {
                    return true;
                }
                int i4 = SettingsBackupAgent.a;
                return acwi.c().b.contains(str);
            }
        };
        yfu yfuVar = new yfu(4);
        yfuVar.e("common_user_settings", tlfVar);
        yfuVar.e("carservice", tlfVar2);
        if (acwi.f()) {
            final int i3 = 2;
            yfuVar.e("LAUNCHER_APP_ENABLED_DISABLED", new tlf() { // from class: mkr
                @Override // defpackage.tlf
                public final boolean a(String str) {
                    int i22 = i3;
                    if (i22 == 0) {
                        int i32 = SettingsBackupAgent.a;
                        return acwi.d().b.contains(str);
                    }
                    if (i22 != 1) {
                        return true;
                    }
                    int i4 = SettingsBackupAgent.a;
                    return acwi.c().b.contains(str);
                }
            });
            yfuVar.e("CUSTOMIZATION_ENABLED_DISABLED", new tlf() { // from class: mkr
                @Override // defpackage.tlf
                public final boolean a(String str) {
                    int i22 = i3;
                    if (i22 == 0) {
                        int i32 = SettingsBackupAgent.a;
                        return acwi.d().b.contains(str);
                    }
                    if (i22 != 1) {
                        return true;
                    }
                    int i4 = SettingsBackupAgent.a;
                    return acwi.c().b.contains(str);
                }
            });
            yfuVar.e("LAUNCHER_APP_POSITIONS", new tlf() { // from class: mkr
                @Override // defpackage.tlf
                public final boolean a(String str) {
                    int i22 = i3;
                    if (i22 == 0) {
                        int i32 = SettingsBackupAgent.a;
                        return acwi.d().b.contains(str);
                    }
                    if (i22 != 1) {
                        return true;
                    }
                    int i4 = SettingsBackupAgent.a;
                    return acwi.c().b.contains(str);
                }
            });
        }
        yfy yfyVarD = yfuVar.d(true);
        ((ype) ((ype) b.f()).ai((char) 5046)).y("backupSpecificationMap: %s", yfyVarD);
        return yfyVarD;
    }

    @Override // defpackage.tlg, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) throws IOException {
        ((ype) ((ype) b.f()).ai((char) 5047)).u("onBackup()");
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
    }

    @Override // defpackage.tlg, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        ((ype) ((ype) b.f()).ai((char) 5048)).u("onRestore()");
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_RESTORED, yzy.MK).l());
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, long j, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        super.onRestore(backupDataInput, j, parcelFileDescriptor);
        ((ype) ((ype) b.f()).ai((char) 5049)).u("onRestore()");
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_RESTORED, yzy.MK).l());
    }
}
