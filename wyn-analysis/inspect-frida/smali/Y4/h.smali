.class public abstract LY4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LY4/g;

.field public static final b:LT3/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY4/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY4/g;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY4/h;->a:LY4/g;

    .line 8
    .line 9
    new-instance v0, LT3/o;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, LT3/o;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LY4/h;->b:LT3/o;

    .line 16
    .line 17
    return-void
.end method
