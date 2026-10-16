.class public abstract LNf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LH6/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LH6/g;

    .line 2
    .line 3
    const-string v1, "NO_OWNER"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LNf/e;->a:LH6/g;

    .line 10
    .line 11
    return-void
.end method

.method public static a()LNf/d;
    .locals 2

    .line 1
    new-instance v0, LNf/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LNf/d;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
