.class public final LGe/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin$qonversionSandwich$2$1$1;

.field public final c:LGe/i;

.field public final d:Lcom/qonversion/android/sdk/dto/QonversionError;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin$qonversionSandwich$2$1$1;LGe/i;)V
    .locals 7

    .line 1
    const-string v0, "application"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "qonversionEventsListener"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LGe/t;->a:Landroid/app/Application;

    .line 15
    .line 16
    iput-object p2, p0, LGe/t;->b:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin$qonversionSandwich$2$1$1;

    .line 17
    .line 18
    iput-object p3, p0, LGe/t;->c:LGe/i;

    .line 19
    .line 20
    new-instance v1, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 21
    .line 22
    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseInvalid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 23
    .line 24
    const-string v3, "Current Android activity is null, cannot perform the action."

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x4

    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, LGe/t;->d:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 33
    .line 34
    return-void
.end method

.method public static a(Z)Ljava/util/Map;
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lef/k;

    .line 6
    .line 7
    const-string v1, "success"

    .line 8
    .line 9
    invoke-direct {v0, v1, p0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lff/B;->E(Lef/k;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
