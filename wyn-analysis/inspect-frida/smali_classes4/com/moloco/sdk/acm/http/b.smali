.class public abstract Lcom/moloco/sdk/acm/http/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lwd/c;

.field public static b:Ljava/lang/String;

.field public static final c:Lef/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LCd/u;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, LCd/u;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lcom/moloco/sdk/acm/http/b;->c:Lef/p;

    .line 13
    .line 14
    return-void
.end method
