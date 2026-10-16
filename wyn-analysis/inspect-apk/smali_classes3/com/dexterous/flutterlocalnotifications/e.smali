.class public final Lcom/dexterous/flutterlocalnotifications/e;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Exact alarms are not permitted"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "exact_alarms_not_permitted"

    .line 7
    .line 8
    iput-object v0, p0, Lcom/dexterous/flutterlocalnotifications/e;->a:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method
