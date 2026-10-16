.class public abstract LKd/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LKd/e;

.field public static final b:LKd/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LKd/e;

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, LKd/e;-><init>(II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LKd/f;->a:LKd/e;

    .line 10
    .line 11
    new-instance v0, LKd/e;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v1, v2}, LKd/e;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LKd/f;->b:LKd/e;

    .line 18
    .line 19
    return-void
.end method
