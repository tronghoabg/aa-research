.class public final Lg2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg2/w;

.field public final b:Lg2/f;

.field public c:Ljava/lang/String;

.field public final synthetic d:Lg2/s;


# direct methods
.method public constructor <init>(Lg2/s;Lg2/w;ILk2/c0;Lg2/d;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/q;->d:Lg2/s;

    .line 5
    .line 6
    iput-object p2, p0, Lg2/q;->a:Lg2/w;

    .line 7
    .line 8
    new-instance v3, Lcom/unity3d/services/core/webview/b;

    .line 9
    .line 10
    const/4 v0, 0x7

    .line 11
    invoke-direct {v3, p0, v0}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lg2/f;

    .line 15
    .line 16
    new-instance v4, Lba/a;

    .line 17
    .line 18
    const/16 v1, 0x9

    .line 19
    .line 20
    invoke-direct {v4, v1, p1, p4}, Lba/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object v2, p2

    .line 24
    move v1, p3

    .line 25
    move-object v5, p5

    .line 26
    invoke-direct/range {v0 .. v5}, Lg2/f;-><init>(ILg2/w;Lcom/unity3d/services/core/webview/b;Lba/a;Lg2/d;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lg2/q;->b:Lg2/f;

    .line 30
    .line 31
    return-void
.end method
