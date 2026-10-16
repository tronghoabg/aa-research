package K3;

import a.AbstractC1304a;
import androidx.work.impl.WorkDatabase_Impl;
import com.moloco.sdk.acm.db.MetricsDb_Impl;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import k3.AbstractC3181m;
import k3.C3184p;
import m3.C3483a;
import m3.C3484b;
import m3.C3486d;
import m3.C3487e;
import o3.InterfaceC3644a;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes.dex */
public final class o extends H5.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6497c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3181m f6498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(MetricsDb_Impl metricsDb_Impl) {
        super(1, 4);
        this.f6498d = metricsDb_Impl;
    }

    @Override // H5.a
    public final void c(InterfaceC3644a interfaceC3644a) {
        switch (this.f6497c) {
            case 0:
                interfaceC3644a.f("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                interfaceC3644a.f("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                interfaceC3644a.f("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                interfaceC3644a.f("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                interfaceC3644a.f("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                interfaceC3644a.f("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                interfaceC3644a.f("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                interfaceC3644a.f("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                interfaceC3644a.f("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                interfaceC3644a.f("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                interfaceC3644a.f("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                interfaceC3644a.f("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                interfaceC3644a.f("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                interfaceC3644a.f("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC3644a.f("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                break;
            default:
                interfaceC3644a.f("CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `eventType` TEXT NOT NULL, `data` INTEGER, `tags` TEXT NOT NULL)");
                interfaceC3644a.f("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                interfaceC3644a.f("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b1f78eccdc6d7153084e9120766fe56b')");
                break;
        }
    }

    @Override // H5.a
    public final void d(InterfaceC3644a interfaceC3644a) {
        switch (this.f6497c) {
            case 0:
                interfaceC3644a.f("DROP TABLE IF EXISTS `Dependency`");
                interfaceC3644a.f("DROP TABLE IF EXISTS `WorkSpec`");
                interfaceC3644a.f("DROP TABLE IF EXISTS `WorkTag`");
                interfaceC3644a.f("DROP TABLE IF EXISTS `SystemIdInfo`");
                interfaceC3644a.f("DROP TABLE IF EXISTS `WorkName`");
                interfaceC3644a.f("DROP TABLE IF EXISTS `WorkProgress`");
                interfaceC3644a.f("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6498d;
                ArrayList arrayList = workDatabase_Impl.f39229g;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ((b) workDatabase_Impl.f39229g.get(i5)).getClass();
                    }
                    break;
                }
                break;
            default:
                interfaceC3644a.f("DROP TABLE IF EXISTS `events`");
                MetricsDb_Impl metricsDb_Impl = (MetricsDb_Impl) this.f6498d;
                ArrayList arrayList2 = metricsDb_Impl.f39229g;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((b) metricsDb_Impl.f39229g.get(i10)).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // H5.a
    public final void i(InterfaceC3644a interfaceC3644a) {
        switch (this.f6497c) {
            case 0:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6498d;
                ArrayList arrayList = workDatabase_Impl.f39229g;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ((b) workDatabase_Impl.f39229g.get(i5)).getClass();
                    }
                    break;
                }
                break;
            default:
                MetricsDb_Impl metricsDb_Impl = (MetricsDb_Impl) this.f6498d;
                ArrayList arrayList2 = metricsDb_Impl.f39229g;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((b) metricsDb_Impl.f39229g.get(i10)).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // H5.a
    public final void j(InterfaceC3644a interfaceC3644a) {
        switch (this.f6497c) {
            case 0:
                ((WorkDatabase_Impl) this.f6498d).f39223a = interfaceC3644a;
                interfaceC3644a.f("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.f6498d).k(interfaceC3644a);
                ArrayList arrayList = ((WorkDatabase_Impl) this.f6498d).f39229g;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ((b) ((WorkDatabase_Impl) this.f6498d).f39229g.get(i5)).a(interfaceC3644a);
                    }
                    break;
                }
                break;
            default:
                ((MetricsDb_Impl) this.f6498d).f39223a = interfaceC3644a;
                ((MetricsDb_Impl) this.f6498d).k(interfaceC3644a);
                ArrayList arrayList2 = ((MetricsDb_Impl) this.f6498d).f39229g;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((b) ((MetricsDb_Impl) this.f6498d).f39229g.get(i10)).a(interfaceC3644a);
                    }
                    break;
                }
                break;
        }
    }

    @Override // H5.a
    public final void l(InterfaceC3644a interfaceC3644a) throws IOException {
        switch (this.f6497c) {
            case 0:
                AbstractC1304a.o(interfaceC3644a);
                break;
            default:
                AbstractC1304a.o(interfaceC3644a);
                break;
        }
    }

    @Override // H5.a
    public final C3184p m(InterfaceC3644a interfaceC3644a) {
        switch (this.f6497c) {
            case 0:
                HashMap map = new HashMap(2);
                map.put("work_spec_id", new C3483a(1, "work_spec_id", "TEXT", null, true, 1));
                map.put("prerequisite_id", new C3483a(2, "prerequisite_id", "TEXT", null, true, 1));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new C3484b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new C3484b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new C3486d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                hashSet2.add(new C3486d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
                C3487e c3487e = new C3487e("Dependency", map, hashSet, hashSet2);
                C3487e c3487eA = C3487e.a(interfaceC3644a, "Dependency");
                if (!c3487e.equals(c3487eA)) {
                    break;
                } else {
                    HashMap map2 = new HashMap(27);
                    map2.put("id", new C3483a(1, "id", "TEXT", null, true, 1));
                    map2.put("state", new C3483a(0, "state", "INTEGER", null, true, 1));
                    map2.put("worker_class_name", new C3483a(0, "worker_class_name", "TEXT", null, true, 1));
                    map2.put("input_merger_class_name", new C3483a(0, "input_merger_class_name", "TEXT", null, false, 1));
                    map2.put("input", new C3483a(0, "input", "BLOB", null, true, 1));
                    map2.put("output", new C3483a(0, "output", "BLOB", null, true, 1));
                    map2.put("initial_delay", new C3483a(0, "initial_delay", "INTEGER", null, true, 1));
                    map2.put("interval_duration", new C3483a(0, "interval_duration", "INTEGER", null, true, 1));
                    map2.put("flex_duration", new C3483a(0, "flex_duration", "INTEGER", null, true, 1));
                    map2.put("run_attempt_count", new C3483a(0, "run_attempt_count", "INTEGER", null, true, 1));
                    map2.put("backoff_policy", new C3483a(0, "backoff_policy", "INTEGER", null, true, 1));
                    map2.put("backoff_delay_duration", new C3483a(0, "backoff_delay_duration", "INTEGER", null, true, 1));
                    map2.put("last_enqueue_time", new C3483a(0, "last_enqueue_time", "INTEGER", null, true, 1));
                    map2.put("minimum_retention_duration", new C3483a(0, "minimum_retention_duration", "INTEGER", null, true, 1));
                    map2.put("schedule_requested_at", new C3483a(0, "schedule_requested_at", "INTEGER", null, true, 1));
                    map2.put("run_in_foreground", new C3483a(0, "run_in_foreground", "INTEGER", null, true, 1));
                    map2.put("out_of_quota_policy", new C3483a(0, "out_of_quota_policy", "INTEGER", null, true, 1));
                    map2.put("period_count", new C3483a(0, "period_count", "INTEGER", "0", true, 1));
                    map2.put("generation", new C3483a(0, "generation", "INTEGER", "0", true, 1));
                    map2.put("required_network_type", new C3483a(0, "required_network_type", "INTEGER", null, true, 1));
                    map2.put("requires_charging", new C3483a(0, "requires_charging", "INTEGER", null, true, 1));
                    map2.put("requires_device_idle", new C3483a(0, "requires_device_idle", "INTEGER", null, true, 1));
                    map2.put("requires_battery_not_low", new C3483a(0, "requires_battery_not_low", "INTEGER", null, true, 1));
                    map2.put("requires_storage_not_low", new C3483a(0, "requires_storage_not_low", "INTEGER", null, true, 1));
                    map2.put("trigger_content_update_delay", new C3483a(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
                    map2.put("trigger_max_content_delay", new C3483a(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
                    map2.put("content_uri_triggers", new C3483a(0, "content_uri_triggers", "BLOB", null, true, 1));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(2);
                    hashSet4.add(new C3486d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
                    hashSet4.add(new C3486d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
                    C3487e c3487e2 = new C3487e("WorkSpec", map2, hashSet3, hashSet4);
                    C3487e c3487eA2 = C3487e.a(interfaceC3644a, "WorkSpec");
                    if (!c3487e2.equals(c3487eA2)) {
                        break;
                    } else {
                        HashMap map3 = new HashMap(2);
                        map3.put("tag", new C3483a(1, "tag", "TEXT", null, true, 1));
                        map3.put("work_spec_id", new C3483a(2, "work_spec_id", "TEXT", null, true, 1));
                        HashSet hashSet5 = new HashSet(1);
                        hashSet5.add(new C3484b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                        HashSet hashSet6 = new HashSet(1);
                        hashSet6.add(new C3486d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                        C3487e c3487e3 = new C3487e("WorkTag", map3, hashSet5, hashSet6);
                        C3487e c3487eA3 = C3487e.a(interfaceC3644a, "WorkTag");
                        if (!c3487e3.equals(c3487eA3)) {
                            break;
                        } else {
                            HashMap map4 = new HashMap(3);
                            map4.put("work_spec_id", new C3483a(1, "work_spec_id", "TEXT", null, true, 1));
                            map4.put("generation", new C3483a(2, "generation", "INTEGER", "0", true, 1));
                            map4.put("system_id", new C3483a(0, "system_id", "INTEGER", null, true, 1));
                            HashSet hashSet7 = new HashSet(1);
                            hashSet7.add(new C3484b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                            C3487e c3487e4 = new C3487e("SystemIdInfo", map4, hashSet7, new HashSet(0));
                            C3487e c3487eA4 = C3487e.a(interfaceC3644a, "SystemIdInfo");
                            if (!c3487e4.equals(c3487eA4)) {
                                break;
                            } else {
                                HashMap map5 = new HashMap(2);
                                map5.put(MediationMetaData.KEY_NAME, new C3483a(1, MediationMetaData.KEY_NAME, "TEXT", null, true, 1));
                                map5.put("work_spec_id", new C3483a(2, "work_spec_id", "TEXT", null, true, 1));
                                HashSet hashSet8 = new HashSet(1);
                                hashSet8.add(new C3484b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                                HashSet hashSet9 = new HashSet(1);
                                hashSet9.add(new C3486d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                                C3487e c3487e5 = new C3487e("WorkName", map5, hashSet8, hashSet9);
                                C3487e c3487eA5 = C3487e.a(interfaceC3644a, "WorkName");
                                if (!c3487e5.equals(c3487eA5)) {
                                    break;
                                } else {
                                    HashMap map6 = new HashMap(2);
                                    map6.put("work_spec_id", new C3483a(1, "work_spec_id", "TEXT", null, true, 1));
                                    map6.put("progress", new C3483a(0, "progress", "BLOB", null, true, 1));
                                    HashSet hashSet10 = new HashSet(1);
                                    hashSet10.add(new C3484b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                                    C3487e c3487e6 = new C3487e("WorkProgress", map6, hashSet10, new HashSet(0));
                                    C3487e c3487eA6 = C3487e.a(interfaceC3644a, "WorkProgress");
                                    if (!c3487e6.equals(c3487eA6)) {
                                        break;
                                    } else {
                                        HashMap map7 = new HashMap(2);
                                        map7.put(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, new C3483a(1, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "TEXT", null, true, 1));
                                        map7.put("long_value", new C3483a(0, "long_value", "INTEGER", null, false, 1));
                                        C3487e c3487e7 = new C3487e("Preference", map7, new HashSet(0), new HashSet(0));
                                        C3487e c3487eA7 = C3487e.a(interfaceC3644a, "Preference");
                                        if (!c3487e7.equals(c3487eA7)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            default:
                HashMap map8 = new HashMap(6);
                map8.put("id", new C3483a(1, "id", "INTEGER", null, true, 1));
                map8.put(MediationMetaData.KEY_NAME, new C3483a(0, MediationMetaData.KEY_NAME, "TEXT", null, true, 1));
                map8.put("timestamp", new C3483a(0, "timestamp", "INTEGER", null, true, 1));
                map8.put("eventType", new C3483a(0, "eventType", "TEXT", null, true, 1));
                map8.put(JsonStorageKeyNames.DATA_KEY, new C3483a(0, JsonStorageKeyNames.DATA_KEY, "INTEGER", null, false, 1));
                map8.put("tags", new C3483a(0, "tags", "TEXT", null, true, 1));
                C3487e c3487e8 = new C3487e("events", map8, new HashSet(0), new HashSet(0));
                C3487e c3487eA8 = C3487e.a(interfaceC3644a, "events");
                if (!c3487e8.equals(c3487eA8)) {
                    break;
                } else {
                    break;
                }
        }
        return new C3184p(true, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(WorkDatabase_Impl workDatabase_Impl) {
        super(16, 4);
        this.f6498d = workDatabase_Impl;
    }
}
