package app.muhammed.com.sharedpreferencesandroid.storage;

import android.content.Context;

/**
 * Created by Muhammed on 01/10/17.
 */

public class StorageHandler {
    private static final String USER_NAME = "username";
    private static final String USER_PASSWORD = "user_password";
    private static final String USER_CHECKED_STATUS = "is_checked";

    public static void insertUsername(Context context, String value) {
        AppStorage.insertStringData(context, USER_NAME, value);

    }

    public static void insertPassword(Context context, String value) {
        AppStorage.insertStringData(context, USER_PASSWORD, value);
    }

    public static void setChecked(Context context, boolean value) {
        AppStorage.insertBooleanData(context, USER_CHECKED_STATUS, value);
    }

    public static boolean isChecked(Context context) {
        return AppStorage.getBooleanData(context, USER_CHECKED_STATUS);
    }
}
