.class public abstract LT6/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld7/d;

.field public static final b:Ld7/d;

.field public static final c:Ld7/d;

.field public static final d:Ld7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ld7/d;

    .line 2
    .line 3
    const-string v1, "account_capability_api"

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LT6/g;->a:Ld7/d;

    .line 11
    .line 12
    new-instance v0, Ld7/d;

    .line 13
    .line 14
    const-string v1, "google_auth_service_accounts"

    .line 15
    .line 16
    const-wide/16 v4, 0x2

    .line 17
    .line 18
    invoke-direct {v0, v1, v4, v5}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 19
    .line 20
    .line 21
    sput-object v0, LT6/g;->b:Ld7/d;

    .line 22
    .line 23
    new-instance v0, Ld7/d;

    .line 24
    .line 25
    const-string v1, "google_auth_service_token"

    .line 26
    .line 27
    const-wide/16 v4, 0x3

    .line 28
    .line 29
    invoke-direct {v0, v1, v4, v5}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LT6/g;->c:Ld7/d;

    .line 33
    .line 34
    new-instance v0, Ld7/d;

    .line 35
    .line 36
    const-string v1, "work_account_client_is_whitelisted"

    .line 37
    .line 38
    invoke-direct {v0, v1, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 39
    .line 40
    .line 41
    sput-object v0, LT6/g;->d:Ld7/d;

    .line 42
    .line 43
    return-void
.end method
