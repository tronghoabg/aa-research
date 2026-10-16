.class public final Lcom/qonversion/android/sdk/automations/Automations$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/automations/Automations;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/Automations$Companion;",
        "",
        "()V",
        "backingInstance",
        "Lcom/qonversion/android/sdk/automations/Automations;",
        "shared",
        "getSharedInstance$annotations",
        "getSharedInstance",
        "()Lcom/qonversion/android/sdk/automations/Automations;",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/qonversion/android/sdk/automations/Automations$Companion;

.field private static backingInstance:Lcom/qonversion/android/sdk/automations/Automations;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/qonversion/android/sdk/automations/Automations$Companion;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/automations/Automations$Companion;-><init>()V

    sput-object v0, Lcom/qonversion/android/sdk/automations/Automations$Companion;->$$INSTANCE:Lcom/qonversion/android/sdk/automations/Automations$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic getSharedInstance$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getSharedInstance()Lcom/qonversion/android/sdk/automations/Automations;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/automations/Automations$Companion;->backingInstance:Lcom/qonversion/android/sdk/automations/Automations;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/qonversion/android/sdk/automations/Automations;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/qonversion/android/sdk/automations/Automations$Companion;->backingInstance:Lcom/qonversion/android/sdk/automations/Automations;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    :try_start_1
    sget-object v1, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;
    :try_end_1
    .catch Lef/B; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_2
    new-instance v1, Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;

    .line 18
    .line 19
    invoke-direct {v1}, Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v1, Lcom/qonversion/android/sdk/automations/Automations$Companion;->backingInstance:Lcom/qonversion/android/sdk/automations/Automations;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    new-instance v1, Lef/B;

    .line 28
    .line 29
    const-string v2, "Qonversion has not been initialized. Automations should be used after Qonversion is initialized."

    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    :cond_0
    :goto_0
    monitor-exit v0

    .line 36
    goto :goto_2

    .line 37
    :goto_1
    monitor-exit v0

    .line 38
    throw v1

    .line 39
    :cond_1
    :goto_2
    sget-object v0, Lcom/qonversion/android/sdk/automations/Automations$Companion;->backingInstance:Lcom/qonversion/android/sdk/automations/Automations;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v1, "Unexpected uninitialized state"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method
