.class public abstract LE0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS3/c;

.field public static final b:LVa/ka;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LS3/c;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, LS3/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LE0/g;->a:LS3/c;

    .line 8
    .line 9
    new-instance v0, LVa/ka;

    .line 10
    .line 11
    invoke-direct {v0}, LVa/ka;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LE0/g;->b:LVa/ka;

    .line 15
    .line 16
    return-void
.end method
