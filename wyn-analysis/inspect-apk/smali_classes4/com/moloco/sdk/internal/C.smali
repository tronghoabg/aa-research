.class public abstract Lcom/moloco/sdk/internal/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/services/encryption/a;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/encryption/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/moloco/sdk/internal/C;->a:Lef/p;

    .line 12
    .line 13
    return-void
.end method
