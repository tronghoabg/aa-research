.class public final LXd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LXd/c;

.field public static final b:Lza/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LXd/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LXd/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LXd/a;->a:LXd/c;

    .line 8
    .line 9
    new-instance v0, Lza/a;

    .line 10
    .line 11
    const/16 v1, 0x1c

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lza/a;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, LXd/a;->b:Lza/a;

    .line 17
    .line 18
    return-void
.end method
